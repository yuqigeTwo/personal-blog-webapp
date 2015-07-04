package com.zuoxiaolong.dynamic;

/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.zuoxiaolong.dao.ArticleDao;
import com.zuoxiaolong.dao.RecordDao;
import com.zuoxiaolong.model.Status;
import com.zuoxiaolong.model.ViewMode;
import com.zuoxiaolong.mvc.DataMap;
import com.zuoxiaolong.mvc.Namespace;
import com.zuoxiaolong.orm.DaoFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author 左潇龙
 * @since 2015年6月18日 下午2:47:47
 */
@Namespace("admin")
public class RecordInput implements DataMap {

	@Override
	public void putCustomData(Map<String, Object> data, HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		if (id != null) {
			data.put("record", DaoFactory.getDao(RecordDao.class).getRecord(Integer.valueOf(id), ViewMode.DYNAMIC));
		}
	}

}
