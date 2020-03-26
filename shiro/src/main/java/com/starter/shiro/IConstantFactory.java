/**
 * Copyright 2018-2020 stylefeng & fengshuonan (https://gitee.com/stylefeng)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.starter.shiro;

import com.xdf.sac.modular.system.model.Dict;
import com.xdf.sac.modular.system.model.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 常量生产工厂的接口
 *
 * @author fengshuonan
 * @date 2017-06-14 21:12
 */
public interface IConstantFactory {

    /**
     * 根据用户id获取用户名称
     *
     * @author stylefeng
     * @Date 2017/5/9 23:41
     */
    String getUserNameById(Integer userId);

    /**
     * 根据用户id获取用户账号
     *
     * @author stylefeng
     * @date 2017年5月16日21:55:371
     */
    String getUserAccountById(Integer userId);

    /**
     * 通过角色ids获取角色名称
     */
    String getRoleName(String roleIds);

    /**
     * 通过角色id获取角色名称
     */
    String getSingleRoleName(Integer roleId);

    /**
     * 通过角色id获取角色英文名称
     */
    String getSingleRoleTip(Integer roleId);

    /**
     * 获取部门名称
     */
    String getDeptName(Integer deptId);

    /**
     * 获取机构名称
     *
     * @param organizationId
     * @return
     */
    String getOrganizationName(Integer organizationId);

    /**
     * 获取菜单的名称们(多个)
     */
    String getMenuNames(String menuIds);

    /**
     * 获取菜单名称
     */
    String getMenuName(Long menuId);

    /**
     * 获取菜单名称通过编号
     */
    String getMenuNameByCode(String code);

    /**
     * 获取字典名称
     */
    String getDictName(Integer dictId);

    /**
     * 获取通知标题
     */
    String getNoticeTitle(Integer dictId);

    /**
     * 根据字典名称和字典中的值获取对应的名称
     */
    String getDictsByName(String name, Integer val);

    /**
     * 获取性别名称
     */
    String getSexName(Integer sex);

    /**
     * 获取用户登录状态
     */
    String getStatusName(Integer status);

    /**
     * 获取菜单状态
     */
    String getMenuStatusName(Integer status);

    /**
     * 查询字典
     */
    List<Dict> findInDict(Integer id);

    /**
     * 获取被缓存的对象(用户删除业务)
     */
    String getCacheObject(String para);

    /**
     * 获取子部门id
     */
    List<Integer> getSubDeptId(Integer deptid);

    /**
     * 获取所有父部门id
     */
    List<Integer> getParentDeptIds(Integer deptid);

    /**
     * 获取模板名称
     *
     * @param templateId
     * @return
     */
    String getTemplateName(int templateId);

    /**
     * 获取某个角色的信息
     *
     * @param classroomId 教室ID
     * @param roleId 角色ID
     * @return
     */
    List<Map<String, Object>> getAssistantByClassroomId(int classroomId, int roleId);

    /**
     * 获取学生姓名
     *
     * @param userId
     * @return
     */
    String getStudentName(int userId);

    /**
     * 获取分组名称
     *
     * @param groupId
     * @return
     */
    String getGroupName(int groupId);

    /**
     * 获取用户角色
     * @param roleId
     * @return
     */
    String getUserRoleName(Integer roleId);

    /**
     * .获取可用标签
     */
    String getTagByClassroomId(int classroomId);

    /**
     * .获取可用教学资源数量
     */
    int getCoursewareCountByClassroomId(int classroomId);

    /**
     * .获取教室内所有学生user_id
     */
    int getStudentCountByClassroomId(int classroomId);


    /**
     * .通过机构ID获取登录用户信息
     */
    List<SysUser> getSysUsersByOrganized(Integer organizationId);
}