package com.hengdong.metrostation.dto.warning;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by wyy on 18-1-5.
 */
@Data
public class WarningInfo {
    private Long id;
    private String xm;
    private String xb;
    private String sfzh;
    private String bjly;
    private String jklxmc;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime insertTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime ccrq;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime gprq;
}
