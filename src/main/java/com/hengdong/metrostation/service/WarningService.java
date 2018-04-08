package com.hengdong.metrostation.service;

import com.hengdong.metrostation.dto.warning.WarningDetail;
import com.hengdong.metrostation.dto.warning.WarningInfo;

import java.util.List;

/**
 * Created by wyy on 18-1-5.
 */
public interface WarningService {
    List<WarningInfo> findWarningInfo();
    List<WarningInfo> findNowWarningInfo();
    WarningDetail findWarningDetail(Long id, String bjly);
    void updateReadFlag(List<Long> ids);

    void updateNowReadFlag(Long id);
}
