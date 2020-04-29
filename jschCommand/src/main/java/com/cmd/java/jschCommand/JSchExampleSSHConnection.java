package com.cmd.java.jschCommand;

import java.io.InputStream;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

/**
 * Hello world!
 *
 */
public class JSchExampleSSHConnection 
{
    public static void main( String[] args )
    {
    	String host="10.11.1.11";
        String user="ubuntu";
        String command1="sudo docker ps -q --filter \"name=rpd-simulator-test\"";
    	String command2="ps -eaf|grep \"gcp_test_client\"| awk 'FNR == 1 {print $NF}'";
    	
        try{

            java.util.Properties config = new java.util.Properties(); 
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session=jsch.getSession(user, host, 22);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");

            com.jcraft.jsch.Channel channel=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(command1);
            channel.setInputStream(null);
    		//channel.setPty(true);
            ((ChannelExec)channel).setErrStream(System.err);

            InputStream in=channel.getInputStream();
            channel.connect();
            String id=null;
            while(true){
              while(in.available()>0){
            	id=in.toString();
              }
              if(channel.isClosed()){
                System.out.println("exit-status: "+channel.getExitStatus());
                break;
              }
              try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channel.disconnect();
    		
    		
    		 Channel channe2=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(command2);
            channel.setInputStream(null);
            ((ChannelExec)channel).setErrStream(System.err);

            InputStream in2=channel.getInputStream();
            channel.connect();
            String port=null;
            while(true){
              while(in.available()>0){
               port=in.toString();
              }
              if(channel.isClosed()){
                System.out.println("exit-status: "+channel.getExitStatus());
                break;
              }
              try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channe2.disconnect();
    		
            String command3="sudo docker exec -ti "+id+" sh -c \"echo /home/gcpp/git-local-gcpp/NGAN-GCPP/src/gcppd/resources/REXRespDsoob.json | nc localhost "+port+"\"";
    		
    		 Channel channe3=session.openChannel("exec");
            ((ChannelExec)channel).setCommand(command3);
            channel.setInputStream(null);
            ((ChannelExec)channel).setErrStream(System.err);

            InputStream in3=channel.getInputStream();
            channel.connect();
            byte[] tmp=new byte[1024];
            while(true){
              while(in.available()>0){
                int i=in.read(tmp, 0, 1024);
                if(i<0)break;
                System.out.print(new String(tmp, 0, i));
              }
              if(channel.isClosed()){
                System.out.println("exit-status: "+channel.getExitStatus());
                break;
              }
              try{Thread.sleep(1000);}catch(Exception ee){}
            }
            channe3.disconnect();
            session.disconnect();
            System.out.println("DONE");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
