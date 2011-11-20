/**
 * Vosao CMS. Simple CMS for Google App Engine.
 * 
 * Copyright (C) 2009-2010 Vosao development team.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * email: vosao.dev@gmail.com
 */

package org.vosao.dao;

import org.vosao.entity.PageTagEntity;

public class PageTagDaoTest extends AbstractDaoTest {

	private PageTagEntity addPageTag(String url) {
		return getDao().getPageTagDao().save(new PageTagEntity(url));
	}
	
	public void testGetByURL() {
		addPageTag("/test1");
		addPageTag("/test2");
		addPageTag("/test3");
		PageTagEntity tag = getDao().getPageTagDao().getByURL("/test1");
		assertNotNull(tag);
		assertEquals("/test1", tag.getPageURL());
	}	
	
}
