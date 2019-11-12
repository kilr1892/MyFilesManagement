package cn.edu.zju.filesupload.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileUploadExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileUploadExample() {
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

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
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

        public Criteria andFileCreateDateIsNull() {
            addCriterion("file_create_date is null");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateIsNotNull() {
            addCriterion("file_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateEqualTo(Date value) {
            addCriterion("file_create_date =", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotEqualTo(Date value) {
            addCriterion("file_create_date <>", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateGreaterThan(Date value) {
            addCriterion("file_create_date >", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("file_create_date >=", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateLessThan(Date value) {
            addCriterion("file_create_date <", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("file_create_date <=", value, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateIn(List<Date> values) {
            addCriterion("file_create_date in", values, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotIn(List<Date> values) {
            addCriterion("file_create_date not in", values, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateBetween(Date value1, Date value2) {
            addCriterion("file_create_date between", value1, value2, "fileCreateDate");
            return (Criteria) this;
        }

        public Criteria andFileCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("file_create_date not between", value1, value2, "fileCreateDate");
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

        public Criteria andFileSizeEqualTo(String value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(String value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(String value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(String value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(String value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(String value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLike(String value) {
            addCriterion("file_size like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotLike(String value) {
            addCriterion("file_size not like", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<String> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<String> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(String value1, String value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(String value1, String value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileOwnerIsNull() {
            addCriterion("file_owner is null");
            return (Criteria) this;
        }

        public Criteria andFileOwnerIsNotNull() {
            addCriterion("file_owner is not null");
            return (Criteria) this;
        }

        public Criteria andFileOwnerEqualTo(String value) {
            addCriterion("file_owner =", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerNotEqualTo(String value) {
            addCriterion("file_owner <>", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerGreaterThan(String value) {
            addCriterion("file_owner >", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("file_owner >=", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerLessThan(String value) {
            addCriterion("file_owner <", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerLessThanOrEqualTo(String value) {
            addCriterion("file_owner <=", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerLike(String value) {
            addCriterion("file_owner like", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerNotLike(String value) {
            addCriterion("file_owner not like", value, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerIn(List<String> values) {
            addCriterion("file_owner in", values, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerNotIn(List<String> values) {
            addCriterion("file_owner not in", values, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerBetween(String value1, String value2) {
            addCriterion("file_owner between", value1, value2, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileOwnerNotBetween(String value1, String value2) {
            addCriterion("file_owner not between", value1, value2, "fileOwner");
            return (Criteria) this;
        }

        public Criteria andFileGradeIsNull() {
            addCriterion("file_grade is null");
            return (Criteria) this;
        }

        public Criteria andFileGradeIsNotNull() {
            addCriterion("file_grade is not null");
            return (Criteria) this;
        }

        public Criteria andFileGradeEqualTo(String value) {
            addCriterion("file_grade =", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotEqualTo(String value) {
            addCriterion("file_grade <>", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeGreaterThan(String value) {
            addCriterion("file_grade >", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeGreaterThanOrEqualTo(String value) {
            addCriterion("file_grade >=", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeLessThan(String value) {
            addCriterion("file_grade <", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeLessThanOrEqualTo(String value) {
            addCriterion("file_grade <=", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeLike(String value) {
            addCriterion("file_grade like", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotLike(String value) {
            addCriterion("file_grade not like", value, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeIn(List<String> values) {
            addCriterion("file_grade in", values, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotIn(List<String> values) {
            addCriterion("file_grade not in", values, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeBetween(String value1, String value2) {
            addCriterion("file_grade between", value1, value2, "fileGrade");
            return (Criteria) this;
        }

        public Criteria andFileGradeNotBetween(String value1, String value2) {
            addCriterion("file_grade not between", value1, value2, "fileGrade");
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

        public Criteria andFileLocationIsNull() {
            addCriterion("file_location is null");
            return (Criteria) this;
        }

        public Criteria andFileLocationIsNotNull() {
            addCriterion("file_location is not null");
            return (Criteria) this;
        }

        public Criteria andFileLocationEqualTo(String value) {
            addCriterion("file_location =", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotEqualTo(String value) {
            addCriterion("file_location <>", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThan(String value) {
            addCriterion("file_location >", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThanOrEqualTo(String value) {
            addCriterion("file_location >=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThan(String value) {
            addCriterion("file_location <", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThanOrEqualTo(String value) {
            addCriterion("file_location <=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLike(String value) {
            addCriterion("file_location like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotLike(String value) {
            addCriterion("file_location not like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationIn(List<String> values) {
            addCriterion("file_location in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotIn(List<String> values) {
            addCriterion("file_location not in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationBetween(String value1, String value2) {
            addCriterion("file_location between", value1, value2, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotBetween(String value1, String value2) {
            addCriterion("file_location not between", value1, value2, "fileLocation");
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

        public Criteria andFileReservedVarchar4IsNull() {
            addCriterion("file_reserved_varchar4 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4IsNotNull() {
            addCriterion("file_reserved_varchar4 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4EqualTo(String value) {
            addCriterion("file_reserved_varchar4 =", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4NotEqualTo(String value) {
            addCriterion("file_reserved_varchar4 <>", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4GreaterThan(String value) {
            addCriterion("file_reserved_varchar4 >", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar4 >=", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4LessThan(String value) {
            addCriterion("file_reserved_varchar4 <", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar4 <=", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4Like(String value) {
            addCriterion("file_reserved_varchar4 like", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4NotLike(String value) {
            addCriterion("file_reserved_varchar4 not like", value, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4In(List<String> values) {
            addCriterion("file_reserved_varchar4 in", values, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4NotIn(List<String> values) {
            addCriterion("file_reserved_varchar4 not in", values, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4Between(String value1, String value2) {
            addCriterion("file_reserved_varchar4 between", value1, value2, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar4NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar4 not between", value1, value2, "fileReservedVarchar4");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5IsNull() {
            addCriterion("file_reserved_varchar5 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5IsNotNull() {
            addCriterion("file_reserved_varchar5 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5EqualTo(String value) {
            addCriterion("file_reserved_varchar5 =", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5NotEqualTo(String value) {
            addCriterion("file_reserved_varchar5 <>", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5GreaterThan(String value) {
            addCriterion("file_reserved_varchar5 >", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar5 >=", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5LessThan(String value) {
            addCriterion("file_reserved_varchar5 <", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar5 <=", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5Like(String value) {
            addCriterion("file_reserved_varchar5 like", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5NotLike(String value) {
            addCriterion("file_reserved_varchar5 not like", value, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5In(List<String> values) {
            addCriterion("file_reserved_varchar5 in", values, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5NotIn(List<String> values) {
            addCriterion("file_reserved_varchar5 not in", values, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5Between(String value1, String value2) {
            addCriterion("file_reserved_varchar5 between", value1, value2, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar5NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar5 not between", value1, value2, "fileReservedVarchar5");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6IsNull() {
            addCriterion("file_reserved_varchar6 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6IsNotNull() {
            addCriterion("file_reserved_varchar6 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6EqualTo(String value) {
            addCriterion("file_reserved_varchar6 =", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6NotEqualTo(String value) {
            addCriterion("file_reserved_varchar6 <>", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6GreaterThan(String value) {
            addCriterion("file_reserved_varchar6 >", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar6 >=", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6LessThan(String value) {
            addCriterion("file_reserved_varchar6 <", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar6 <=", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6Like(String value) {
            addCriterion("file_reserved_varchar6 like", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6NotLike(String value) {
            addCriterion("file_reserved_varchar6 not like", value, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6In(List<String> values) {
            addCriterion("file_reserved_varchar6 in", values, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6NotIn(List<String> values) {
            addCriterion("file_reserved_varchar6 not in", values, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6Between(String value1, String value2) {
            addCriterion("file_reserved_varchar6 between", value1, value2, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar6NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar6 not between", value1, value2, "fileReservedVarchar6");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7IsNull() {
            addCriterion("file_reserved_varchar7 is null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7IsNotNull() {
            addCriterion("file_reserved_varchar7 is not null");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7EqualTo(String value) {
            addCriterion("file_reserved_varchar7 =", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7NotEqualTo(String value) {
            addCriterion("file_reserved_varchar7 <>", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7GreaterThan(String value) {
            addCriterion("file_reserved_varchar7 >", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7GreaterThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar7 >=", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7LessThan(String value) {
            addCriterion("file_reserved_varchar7 <", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7LessThanOrEqualTo(String value) {
            addCriterion("file_reserved_varchar7 <=", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7Like(String value) {
            addCriterion("file_reserved_varchar7 like", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7NotLike(String value) {
            addCriterion("file_reserved_varchar7 not like", value, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7In(List<String> values) {
            addCriterion("file_reserved_varchar7 in", values, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7NotIn(List<String> values) {
            addCriterion("file_reserved_varchar7 not in", values, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7Between(String value1, String value2) {
            addCriterion("file_reserved_varchar7 between", value1, value2, "fileReservedVarchar7");
            return (Criteria) this;
        }

        public Criteria andFileReservedVarchar7NotBetween(String value1, String value2) {
            addCriterion("file_reserved_varchar7 not between", value1, value2, "fileReservedVarchar7");
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