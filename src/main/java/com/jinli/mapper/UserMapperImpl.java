package com.jinli.mapper;

import com.jinli.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.List;

public class UserMapperImpl implements UserMapper{

    //原来我们所有的操作都是使用sqlSession来执行的，现在都是用SqlSessionTemplate
    private SqlSessionTemplate sqlSession;
    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }
   //自定义接口
    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();

    }
}
