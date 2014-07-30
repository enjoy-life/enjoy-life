package com.enjoylife.common.model.account;



/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-7-30
 * Time: PM4:18
 * To change this template use File | Settings | File Templates.
 */
public class SecretUser extends User {
    private static final long serialVersionUID = -4136580064389760095L;

    private ThirdPartTypeEnum thirdPartTypeEnum;    // 所属第三方账号类型
    private String access_token;                    // 授权令牌，Access_Token
    private String refresh_token;                   // 在授权自动续期步骤中，获取新的Access_Token时需要提供的参数
    private String expires_in;                      // 该access token的有效期，单位为秒
    private String openid;                          // 用户的ID



    public ThirdPartTypeEnum getThirdPartTypeEnum() {
        return thirdPartTypeEnum;
    }

    public void setThirdPartTypeEnum(ThirdPartTypeEnum thirdPartTypeEnum) {
        this.thirdPartTypeEnum = thirdPartTypeEnum;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(String expires_in) {
        this.expires_in = expires_in;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
