package com.mj.modules.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mj.common.service.BaseService;
import com.mj.modules.cms.dao.PictureShowDao;
import com.mj.modules.cms.entity.PictureShowEntity;

@Service
@Transactional(readOnly=true)
public class PictureShowService extends BaseService {
	@Autowired
	private PictureShowDao pictureShowDao;

	/**
	 * 获取轮播图片
	 * @return
	 */
	public List<PictureShowEntity> getPictureShowEntityList(){
		return this.pictureShowDao.getPictureShowEntity(companyLimt);
	}
}
