package com.dream.representation.user;

import com.dream.representation.user.validated.CreateUser;
import com.dream.representation.user.validated.UpdateUser;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserObject implements Serializable {
    private Long id;

    @Size(min = 2, max = 20, message = "用户登录名应该在 {min} - {max} 个字符之间", groups = {CreateUser.class})
    @NotBlank(message = "用户登录名不能为空", groups = {CreateUser.class})
    private String username;

    @Size(min = 2, max = 30, message = "用户姓名应该在 {min} - {max} 个字符之间", groups = {CreateUser.class, UpdateUser.class})
    @NotBlank(message = "用户登录名不能为空", groups = {CreateUser.class})
    private String name;

    @NotBlank(message = "用户登录名不能为空", groups = {CreateUser.class, UpdateUser.class})
    @Size(max = 11, message = "请输入正确的手机号", groups = {CreateUser.class, UpdateUser.class})
    @Pattern(regexp = "^[1][3,4,5,7,8][0-9]{9}$", message = "请输入正确的手机号", groups = {CreateUser.class, UpdateUser.class})
    private String phone;

    @Email(message = "请输入正确的邮箱", groups = {CreateUser.class, UpdateUser.class})
    private String email;
}
