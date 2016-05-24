package com.iwooto.redis;

import java.util.Set;

public class JedisClientSingleImpl implements JedisClient {

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] get(byte[] key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(String key, String value, int expire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(byte[] key, byte[] value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String set(byte[] key, byte[] value, int expire) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hget(String hkey, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long incr(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long expire(String key, int second) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long ttl(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long del(String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long del(byte[] key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long hdel(String hkey, String key) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<byte[]> keys(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flushDB() {
		// TODO Auto-generated method stub

	}

	@Override
	public Long dbSize() {
		// TODO Auto-generated method stub
		return null;
	}

}
