package com.example.springsocial.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;

import java.time.Duration;

//@Configuration
//@Profile("redis-standalone")
//public class RedisStandAloneConfig extends RedisConfig<String, Object>{
//    @Bean
//    public JedisConnectionFactory redisStandAloneConnectionFactory() {
//        RedisStandaloneConfiguration standaloneConfiguration = new RedisStandaloneConfiguration("172.20.0.2", 6379);
//        //JedisConnectionFactory.MutableJedisClientConfiguration
////        JedisPoolConfig poolConfig = new JedisPoolConfig();
////        poolConfig.setMaxTotal(20);
////        poolConfig.setMaxIdle(20);
////        poolConfig.setBlockWhenExhausted(true);
////        poolConfig.setMaxWaitMillis(3000);
//        JedisClientConfiguration jedisClientConfiguration = JedisClientConfiguration.builder()
//                .connectTimeout(Duration.ofMillis(20000))
//                .readTimeout(Duration.ofMillis(20000)).build();
//
//        //JedisClientConfiguration.builder().readTimeout(Duration.ofMillis(20000) );
//        JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory(standaloneConfiguration, jedisClientConfiguration);
//        jedisConnectionFactory.getPoolConfig().setMaxTotal(20);
//        jedisConnectionFactory.getPoolConfig().setMaxIdle(20);
//        jedisConnectionFactory.getPoolConfig().setMinIdle(10);
//        jedisConnectionFactory.getPoolConfig().setBlockWhenExhausted(true);
//        jedisConnectionFactory.getPoolConfig().setMaxWaitMillis(3000);
//
//        return jedisConnectionFactory;
//    }
//
//
//
//    @Bean("redisTemplate")
//    public RedisTemplate<String, Object> redisTemplate() {
//        RedisTemplate<String, Object> template = getRedisTemplate();
//        template.setConnectionFactory(redisStandAloneConnectionFactory());
////        RedisTemplate<String, Object> template = new RedisTemplate<>();
////        template.setConnectionFactory(redisStandAloneConnectionFactory());
////
////        Jackson2JsonRedisSerializer<Object> jsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
////        template.setKeySerializer(new StringRedisSerializer());
////        template.setHashKeySerializer(new StringRedisSerializer());
////
////        template.setValueSerializer(jsonRedisSerializer);
////        template.setHashKeySerializer(jsonRedisSerializer);
//        return template;
//    }
//}
