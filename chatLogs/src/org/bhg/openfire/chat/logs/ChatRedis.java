package org.bhg.openfire.chat.logs;

import redis.clients.jedis.Jedis;

public class ChatRedis {
	
	private static Jedis jedis=null;
	private static LoadPropersties pop=null;
	static{
	    pop=new LoadPropersties();
        jedis=new Jedis(pop.getProperties("db.ip"),Integer.parseInt(pop.getProperties("db.port")));
		jedis.select(4);
	}
	public static void  push(String Content){
		jedis.lpush(pop.getProperties("db.name"), Content);
	}
	public static void main(String[] args){
		
	}
}
