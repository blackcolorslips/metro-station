package com.hengdong.metrostation.dao;

import com.hengdong.metrostation.dto.warning.WarningDetail;
import com.hengdong.metrostation.dto.warning.WarningInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by wyy on 18-1-5.
 */
@Mapper
public interface WarningDao {
    List<WarningInfo> findWarningInfo();

    List<WarningInfo> findNowWarningInfo();

    WarningDetail findWarningDetail(@Param("id") Long id, @Param("bjly") String bjly);

    WarningDetail findSelfCheckWarningDetail(@Param("id") Long id);

    void updateReadFlag(List<Long> ids);

    void updateNowReadFlag(Long id);
}
