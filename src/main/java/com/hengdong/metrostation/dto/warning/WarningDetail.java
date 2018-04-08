package com.hengdong.metrostation.dto.warning;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by wyy on 18-1-9.
 */
@Data
public class WarningDetail {
    private Long id;
    private String xm;
    private String xb;
    private String sfzh;
    private String zjzp;
    private String sfd;
    private String mdd;
    private String jpk;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ccrq;
    private String jklxmc;
    private String xq;
    private String bjly;
    private String zprlzp;
    private String sbmc;
}
