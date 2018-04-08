package com.hengdong.metrostation.service.Impl;

import com.hengdong.metrostation.constant.BjlyConstants;
import com.hengdong.metrostation.dao.WarningDao;
import com.hengdong.metrostation.dto.warning.WarningDetail;
import com.hengdong.metrostation.dto.warning.WarningInfo;
import com.hengdong.metrostation.service.WarningService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wyy on 18-1-5.
 */
@Service
@Slf4j
public class WarningServiceImpl implements WarningService {
    @Autowired
    private WarningDao warningDao;
    @Override
    public List<WarningInfo> findWarningInfo() {
        return warningDao.findWarningInfo();
    }

    @Override
    public List<WarningInfo> findNowWarningInfo() {
        return warningDao.findNowWarningInfo();
    }

    @Override
    public WarningDetail findWarningDetail(Long id, String bjly) {
        if (bjly.equals(BjlyConstants.SELF_CHECK)) {
            return warningDao.findSelfCheckWarningDetail(id);
        }
        return warningDao.findWarningDetail(id, bjly);
    }

    @Override
    public void updateReadFlag(List<Long> ids) {
        warningDao.updateReadFlag(ids);
    }

    @Override
    public void updateNowReadFlag(Long id) {
        warningDao.updateNowReadFlag(id);
    }
}
