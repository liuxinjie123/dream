package com.dream.representation.common;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseObject implements Serializable {
    private String createManId;                                        //创建人id
    @JsonFormat(pattern = EnumCommonString.LocalDateTime_Pattern, timezone = EnumCommonString.GMT_8)
    private LocalDateTime createTime;                                  //创建时间
    private String lastUpdateManId;                                    //最后一次更新人id
    @JsonFormat(pattern = EnumCommonString.LocalDateTime_Pattern, timezone = EnumCommonString.GMT_8)@Column(name = "last_update_time")
    private LocalDateTime lastUpdateTime;                               //最后一次更新时间

    protected String showInfo() {
        return "createManId: " + createManId + ", createTime: " + createTime + ", lastUpdateManId: " + lastUpdateManId + ", lastUpdateTime: " + lastUpdateTime;
    }
}
