package com.aws.spring_study.repository;

import com.aws.spring_study.dto.ModifyUserReqDto;
import com.aws.spring_study.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMappers {
    // 함수이름과 xml의 id와 같아야한다 -> 구현은 xml에서 함(인터페이스니까), 매개변수와 parameterType이 같아야한다
    public Integer saveUser(RegisterUserReqDto registerUserReqDto);
    public List<User> getUserListAll();
    public Integer updateUser(ModifyUserReqDto modifyUserReqDto);
    public Integer deleteUser(int userId);
}
