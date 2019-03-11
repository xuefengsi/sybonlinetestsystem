package com.alice.mapper;

import com.alice.entity.UserAccountEntity;
import com.alice.model.KeyValueVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户账号mapper
 */
public interface IUserAccountMapper {

    void addUser(UserAccountEntity user);

    void deleteUser(List<String> numbers);

    void updateUser(List<KeyValueVO> fieldAndValues);

    Integer verifyUserLogin(@Param("number") String number, @Param("password") String password);
}
