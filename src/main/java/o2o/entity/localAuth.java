package o2o.entity;

import java.util.Date;

/**
 * Created by hxk
 * 2018/12/5 10:56
 */

public class localAuth {

    private Long localAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date lastEditTmie;
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public void setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTmie() {
        return lastEditTmie;
    }

    public void setLastEditTmie(Date lastEditTmie) {
        this.lastEditTmie = lastEditTmie;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }
}
