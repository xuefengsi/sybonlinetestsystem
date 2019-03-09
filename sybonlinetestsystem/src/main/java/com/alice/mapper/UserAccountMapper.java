package com.alice.mapper;

import com.alice.entity.UserAccountEntity;
import com.alice.model.KeyValueVO;

import java.util.List;

/**
 * 用户账号mapper
 */
public interface UserAccountMapper {

    void addUser(UserAccountEntity user);

    void deleteUser(List<String> numbers);

    void updateUser(List<KeyValueVO> fieldAndValues);

    void verifyUserLogin(String number, String password);
}
