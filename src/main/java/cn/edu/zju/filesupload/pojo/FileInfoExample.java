package cn.edu.zju.filesupload.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameIsNull() {
            addCriterion("file_created_by_name is null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameIsNotNull() {
            addCriterion("file_created_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameEqualTo(String value) {
            addCriterion("file_created_by_name =", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameNotEqualTo(String value) {
            addCriterion("file_created_by_name <>", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameGreaterThan(String value) {
            addCriterion("file_created_by_name >", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_created_by_name >=", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameLessThan(String value) {
            addCriterion("file_created_by_name <", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameLessThanOrEqualTo(String value) {
            addCriterion("file_created_by_name <=", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameLike(String value) {
            addCriterion("file_created_by_name like", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameNotLike(String value) {
            addCriterion("file_created_by_name not like", value, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameIn(List<String> values) {
            addCriterion("file_created_by_name in", values, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameNotIn(List<String> values) {
            addCriterion("file_created_by_name not in", values, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameBetween(String value1, String value2) {
            addCriterion("file_created_by_name between", value1, value2, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedByNameNotBetween(String value1, String value2) {
            addCriterion("file_created_by_name not between", value1, value2, "fileCreatedByName");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateIsNull() {
            addCriterion("file_created_date is null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateIsNotNull() {
            addCriterion("file_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateEqualTo(Date value) {
            addCriterion("file_created_date =", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateNotEqualTo(Date value) {
            addCriterion("file_created_date <>", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateGreaterThan(Date value) {
            addCriterion("file_created_date >", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_created_date >=", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateLessThan(Date value) {
            addCriterion("file_created_date <", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("file_created_date <=", value, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateIn(List<Date> values) {
            addCriterion("file_created_date in", values, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateNotIn(List<Date> values) {
            addCriterion("file_created_date not in", values, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateBetween(Date value1, Date value2) {
            addCriterion("file_created_date between", value1, value2, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("file_created_date not between", value1, value2, "fileCreatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameIsNull() {
            addCriterion("file_updated_by_name is null");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameIsNotNull() {
            addCriterion("file_updated_by_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameEqualTo(String value) {
            addCriterion("file_updated_by_name =", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameNotEqualTo(String value) {
            addCriterion("file_updated_by_name <>", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameGreaterThan(String value) {
            addCriterion("file_updated_by_name >", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_updated_by_name >=", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameLessThan(String value) {
            addCriterion("file_updated_by_name <", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameLessThanOrEqualTo(String value) {
            addCriterion("file_updated_by_name <=", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameLike(String value) {
            addCriterion("file_updated_by_name like", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameNotLike(String value) {
            addCriterion("file_updated_by_name not like", value, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameIn(List<String> values) {
            addCriterion("file_updated_by_name in", values, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameNotIn(List<String> values) {
            addCriterion("file_updated_by_name not in", values, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameBetween(String value1, String value2) {
            addCriterion("file_updated_by_name between", value1, value2, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedByNameNotBetween(String value1, String value2) {
            addCriterion("file_updated_by_name not between", value1, value2, "fileUpdatedByName");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateIsNull() {
            addCriterion("file_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateIsNotNull() {
            addCriterion("file_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateEqualTo(Date value) {
            addCriterion("file_updated_date =", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateNotEqualTo(Date value) {
            addCriterion("file_updated_date <>", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateGreaterThan(Date value) {
            addCriterion("file_updated_date >", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_updated_date >=", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateLessThan(Date value) {
            addCriterion("file_updated_date <", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("file_updated_date <=", value, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateIn(List<Date> values) {
            addCriterion("file_updated_date in", values, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateNotIn(List<Date> values) {
            addCriterion("file_updated_date not in", values, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("file_updated_date between", value1, value2, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("file_updated_date not between", value1, value2, "fileUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIsNull() {
            addCriterion("file_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIsNotNull() {
            addCriterion("file_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeEqualTo(String value) {
            addCriterion("file_delete_time =", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotEqualTo(String value) {
            addCriterion("file_delete_time <>", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeGreaterThan(String value) {
            addCriterion("file_delete_time >", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("file_delete_time >=", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLessThan(String value) {
            addCriterion("file_delete_time <", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLessThanOrEqualTo(String value) {
            addCriterion("file_delete_time <=", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeLike(String value) {
            addCriterion("file_delete_time like", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotLike(String value) {
            addCriterion("file_delete_time not like", value, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeIn(List<String> values) {
            addCriterion("file_delete_time in", values, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotIn(List<String> values) {
            addCriterion("file_delete_time not in", values, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeBetween(String value1, String value2) {
            addCriterion("file_delete_time between", value1, value2, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileDeleteTimeNotBetween(String value1, String value2) {
            addCriterion("file_delete_time not between", value1, value2, "fileDeleteTime");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIsNull() {
            addCriterion("file_original_name is null");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIsNotNull() {
            addCriterion("file_original_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameEqualTo(String value) {
            addCriterion("file_original_name =", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotEqualTo(String value) {
            addCriterion("file_original_name <>", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameGreaterThan(String value) {
            addCriterion("file_original_name >", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_original_name >=", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLessThan(String value) {
            addCriterion("file_original_name <", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("file_original_name <=", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameLike(String value) {
            addCriterion("file_original_name like", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotLike(String value) {
            addCriterion("file_original_name not like", value, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameIn(List<String> values) {
            addCriterion("file_original_name in", values, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotIn(List<String> values) {
            addCriterion("file_original_name not in", values, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameBetween(String value1, String value2) {
            addCriterion("file_original_name between", value1, value2, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFileOriginalNameNotBetween(String value1, String value2) {
            addCriterion("file_original_name not between", value1, value2, "fileOriginalName");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteIsNull() {
            addCriterion("file_is_delete is null");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteIsNotNull() {
            addCriterion("file_is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteEqualTo(Boolean value) {
            addCriterion("file_is_delete =", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteNotEqualTo(Boolean value) {
            addCriterion("file_is_delete <>", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteGreaterThan(Boolean value) {
            addCriterion("file_is_delete >", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("file_is_delete >=", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteLessThan(Boolean value) {
            addCriterion("file_is_delete <", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("file_is_delete <=", value, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteIn(List<Boolean> values) {
            addCriterion("file_is_delete in", values, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteNotIn(List<Boolean> values) {
            addCriterion("file_is_delete not in", values, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("file_is_delete between", value1, value2, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("file_is_delete not between", value1, value2, "fileIsDelete");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNull() {
            addCriterion("file_md5 is null");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNotNull() {
            addCriterion("file_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andFileMd5EqualTo(String value) {
            addCriterion("file_md5 =", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotEqualTo(String value) {
            addCriterion("file_md5 <>", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThan(String value) {
            addCriterion("file_md5 >", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThanOrEqualTo(String value) {
            addCriterion("file_md5 >=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThan(String value) {
            addCriterion("file_md5 <", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThanOrEqualTo(String value) {
            addCriterion("file_md5 <=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Like(String value) {
            addCriterion("file_md5 like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotLike(String value) {
            addCriterion("file_md5 not like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5In(List<String> values) {
            addCriterion("file_md5 in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotIn(List<String> values) {
            addCriterion("file_md5 not in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Between(String value1, String value2) {
            addCriterion("file_md5 between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotBetween(String value1, String value2) {
            addCriterion("file_md5 not between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdIsNull() {
            addCriterion("file_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdIsNotNull() {
            addCriterion("file_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdEqualTo(String value) {
            addCriterion("file_resource_id =", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdNotEqualTo(String value) {
            addCriterion("file_resource_id <>", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdGreaterThan(String value) {
            addCriterion("file_resource_id >", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_resource_id >=", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdLessThan(String value) {
            addCriterion("file_resource_id <", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdLessThanOrEqualTo(String value) {
            addCriterion("file_resource_id <=", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdLike(String value) {
            addCriterion("file_resource_id like", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdNotLike(String value) {
            addCriterion("file_resource_id not like", value, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdIn(List<String> values) {
            addCriterion("file_resource_id in", values, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdNotIn(List<String> values) {
            addCriterion("file_resource_id not in", values, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdBetween(String value1, String value2) {
            addCriterion("file_resource_id between", value1, value2, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileResourceIdNotBetween(String value1, String value2) {
            addCriterion("file_resource_id not between", value1, value2, "fileResourceId");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Long value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Long value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Long value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Long value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Long value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Long> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Long> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Long value1, Long value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Long value1, Long value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileIsValidIsNull() {
            addCriterion("file_is_valid is null");
            return (Criteria) this;
        }

        public Criteria andFileIsValidIsNotNull() {
            addCriterion("file_is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andFileIsValidEqualTo(Boolean value) {
            addCriterion("file_is_valid =", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidNotEqualTo(Boolean value) {
            addCriterion("file_is_valid <>", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidGreaterThan(Boolean value) {
            addCriterion("file_is_valid >", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("file_is_valid >=", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidLessThan(Boolean value) {
            addCriterion("file_is_valid <", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidLessThanOrEqualTo(Boolean value) {
            addCriterion("file_is_valid <=", value, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidIn(List<Boolean> values) {
            addCriterion("file_is_valid in", values, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidNotIn(List<Boolean> values) {
            addCriterion("file_is_valid not in", values, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidBetween(Boolean value1, Boolean value2) {
            addCriterion("file_is_valid between", value1, value2, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileIsValidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("file_is_valid not between", value1, value2, "fileIsValid");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1IsNull() {
            addCriterion("file_reserved_varchar1 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1IsNotNull() {
            addCriterion("file_reserved_varchar1 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1EqualTo(String value) {
            addCriterion("file_reserved_varchar1 =", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1NotEqualTo(String value) {
            addCriterion("file_reserved_varchar1 <>", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1GreaterThan(String value) {
            addCriterion("file_reserved_varchar1 >", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar1 >=", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1LessThan(String value) {
            addCriterion("file_reserved_varchar1 <", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar1 <=", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1Like(String value) {
            addCriterion("file_reserved_varchar1 like", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1NotLike(String value) {
            addCriterion("file_reserved_varchar1 not like", value, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1In(List<String> values) {
            addCriterion("file_reserved_varchar1 in", values, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1NotIn(List<String> values) {
            addCriterion("file_reserved_varchar1 not in", values, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1Between(String value1, String value2) {
            addCriterion("file_reserved_varchar1 between", value1, value2, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar1NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar1 not between", value1, value2, "fileReservedVarchar1");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2IsNull() {
            addCriterion("file_reserved_varchar2 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2IsNotNull() {
            addCriterion("file_reserved_varchar2 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2EqualTo(String value) {
            addCriterion("file_reserved_varchar2 =", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2NotEqualTo(String value) {
            addCriterion("file_reserved_varchar2 <>", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2GreaterThan(String value) {
            addCriterion("file_reserved_varchar2 >", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar2 >=", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2LessThan(String value) {
            addCriterion("file_reserved_varchar2 <", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar2 <=", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2Like(String value) {
            addCriterion("file_reserved_varchar2 like", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2NotLike(String value) {
            addCriterion("file_reserved_varchar2 not like", value, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2In(List<String> values) {
            addCriterion("file_reserved_varchar2 in", values, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2NotIn(List<String> values) {
            addCriterion("file_reserved_varchar2 not in", values, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2Between(String value1, String value2) {
            addCriterion("file_reserved_varchar2 between", value1, value2, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar2NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar2 not between", value1, value2, "fileReservedVarchar2");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3IsNull() {
            addCriterion("file_reserved_varchar3 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3IsNotNull() {
            addCriterion("file_reserved_varchar3 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3EqualTo(String value) {
            addCriterion("file_reserved_varchar3 =", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3NotEqualTo(String value) {
            addCriterion("file_reserved_varchar3 <>", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3GreaterThan(String value) {
            addCriterion("file_reserved_varchar3 >", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar3 >=", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3LessThan(String value) {
            addCriterion("file_reserved_varchar3 <", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar3 <=", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3Like(String value) {
            addCriterion("file_reserved_varchar3 like", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3NotLike(String value) {
            addCriterion("file_reserved_varchar3 not like", value, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3In(List<String> values) {
            addCriterion("file_reserved_varchar3 in", values, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3NotIn(List<String> values) {
            addCriterion("file_reserved_varchar3 not in", values, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3Between(String value1, String value2) {
            addCriterion("file_reserved_varchar3 between", value1, value2, "fileReservedVarchar3");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar3NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar3 not between", value1, value2, "fileReservedVarchar3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}