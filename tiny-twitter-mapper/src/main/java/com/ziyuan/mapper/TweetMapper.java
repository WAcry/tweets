package com.ziyuan.mapper;

import com.ziyuan.pojo.Tweet;
import com.ziyuan.pojo.TweetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TweetMapper {
    long countByExample(TweetExample example);

    int deleteByExample(TweetExample example);

    int deleteByPrimaryKey(String id);

    int insert(Tweet record);

    int insertSelective(Tweet record);

    List<Tweet> selectByExample(TweetExample example);

    Tweet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Tweet record, @Param("example") TweetExample example);

    int updateByExample(@Param("record") Tweet record, @Param("example") TweetExample example);

    int updateByPrimaryKeySelective(Tweet record);

    int updateByPrimaryKey(Tweet record);
}