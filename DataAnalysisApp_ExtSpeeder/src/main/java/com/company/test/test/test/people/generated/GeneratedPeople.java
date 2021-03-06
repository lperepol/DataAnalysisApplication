package com.company.test.test.test.people.generated;

import com.company.test.test.test.people.People;
import com.speedment.Entity;
import com.speedment.config.db.mapper.identity.IntegerIdentityMapper;
import com.speedment.config.db.mapper.identity.StringIdentityMapper;
import com.speedment.field.ComparableField;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.StringField;
import com.speedment.internal.core.field.ComparableFieldImpl;
import com.speedment.internal.core.field.StringFieldImpl;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * The generated base interface representing an entity (for example, a row)
 * in the Table test.test.test.people.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public interface GeneratedPeople extends Entity<People> {
    
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getId()} method.
     */
    final ComparableField<People, Integer, Integer> ID = new ComparableFieldImpl<>(Identifier.ID, People::getId, People::setId, new IntegerIdentityMapper(), true);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSerialno()} method.
     */
    final ComparableField<People, Integer, Integer> SERIALNO = new ComparableFieldImpl<>(Identifier.SERIALNO, People::getSerialno, People::setSerialno, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getState()} method.
     */
    final StringField<People, String> STATE = new StringFieldImpl<>(Identifier.STATE, People::getState, People::setState, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getIncomeAdjustmentCode()} method.
     */
    final ComparableField<People, Integer, Integer> INCOME_ADJUSTMENT_CODE = new ComparableFieldImpl<>(Identifier.INCOME_ADJUSTMENT_CODE, People::getIncomeAdjustmentCode, People::setIncomeAdjustmentCode, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getClassOfWorker()} method.
     */
    final StringField<People, String> CLASS_OF_WORKER = new StringFieldImpl<>(Identifier.CLASS_OF_WORKER, o -> o.getClassOfWorker().orElse(null), People::setClassOfWorker, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getDividents()} method.
     */
    final ComparableField<People, Integer, Integer> DIVIDENTS = new ComparableFieldImpl<>(Identifier.DIVIDENTS, People::getDividents, People::setDividents, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getAllOtherIncomes()} method.
     */
    final ComparableField<People, Integer, Integer> ALL_OTHER_INCOMES = new ComparableFieldImpl<>(Identifier.ALL_OTHER_INCOMES, People::getAllOtherIncomes, People::setAllOtherIncomes, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getPublicAssistanceIncome()} method.
     */
    final ComparableField<People, Integer, Integer> PUBLIC_ASSISTANCE_INCOME = new ComparableFieldImpl<>(Identifier.PUBLIC_ASSISTANCE_INCOME, People::getPublicAssistanceIncome, People::setPublicAssistanceIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getRetirementIncome()} method.
     */
    final ComparableField<People, Integer, Integer> RETIREMENT_INCOME = new ComparableFieldImpl<>(Identifier.RETIREMENT_INCOME, People::getRetirementIncome, People::setRetirementIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getEducationalAttainment()} method.
     */
    final StringField<People, String> EDUCATIONAL_ATTAINMENT = new StringFieldImpl<>(Identifier.EDUCATIONAL_ATTAINMENT, o -> o.getEducationalAttainment().orElse(null), People::setEducationalAttainment, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSelfEmploymentIncome()} method.
     */
    final ComparableField<People, Integer, Integer> SELF_EMPLOYMENT_INCOME = new ComparableFieldImpl<>(Identifier.SELF_EMPLOYMENT_INCOME, People::getSelfEmploymentIncome, People::setSelfEmploymentIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSupplementarySecurityIncome()} method.
     */
    final ComparableField<People, Integer, Integer> SUPPLEMENTARY_SECURITY_INCOME = new ComparableFieldImpl<>(Identifier.SUPPLEMENTARY_SECURITY_INCOME, People::getSupplementarySecurityIncome, People::setSupplementarySecurityIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSocialSecurityIncome()} method.
     */
    final ComparableField<People, Integer, Integer> SOCIAL_SECURITY_INCOME = new ComparableFieldImpl<>(Identifier.SOCIAL_SECURITY_INCOME, People::getSocialSecurityIncome, People::setSocialSecurityIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSalaryIncome()} method.
     */
    final ComparableField<People, Integer, Integer> SALARY_INCOME = new ComparableFieldImpl<>(Identifier.SALARY_INCOME, People::getSalaryIncome, People::setSalaryIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getSex()} method.
     */
    final StringField<People, String> SEX = new StringFieldImpl<>(Identifier.SEX, o -> o.getSex().orElse(null), People::setSex, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getWorkedHoursPerWeek()} method.
     */
    final ComparableField<People, Integer, Integer> WORKED_HOURS_PER_WEEK = new ComparableFieldImpl<>(Identifier.WORKED_HOURS_PER_WEEK, People::getWorkedHoursPerWeek, People::setWorkedHoursPerWeek, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getIndustryRecord()} method.
     */
    final StringField<People, String> INDUSTRY_RECORD = new StringFieldImpl<>(Identifier.INDUSTRY_RECORD, o -> o.getIndustryRecord().orElse(null), People::setIndustryRecord, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getNaicsIndustryRecord()} method.
     */
    final StringField<People, String> NAICS_INDUSTRY_RECORD = new StringFieldImpl<>(Identifier.NAICS_INDUSTRY_RECORD, o -> o.getNaicsIndustryRecord().orElse(null), People::setNaicsIndustryRecord, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getOccupation()} method.
     */
    final StringField<People, String> OCCUPATION = new StringFieldImpl<>(Identifier.OCCUPATION, o -> o.getOccupation().orElse(null), People::setOccupation, new StringIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getTotalPersonEarnings()} method.
     */
    final ComparableField<People, Integer, Integer> TOTAL_PERSON_EARNINGS = new ComparableFieldImpl<>(Identifier.TOTAL_PERSON_EARNINGS, People::getTotalPersonEarnings, People::setTotalPersonEarnings, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getTotalPersonIncome()} method.
     */
    final ComparableField<People, Integer, Integer> TOTAL_PERSON_INCOME = new ComparableFieldImpl<>(Identifier.TOTAL_PERSON_INCOME, People::getTotalPersonIncome, People::setTotalPersonIncome, new IntegerIdentityMapper(), false);
    /**
     * This Field corresponds to the {@link People} field that can be obtained
     * using the {@link People#getIncomeToPovertyRatio()} method.
     */
    final ComparableField<People, Integer, Integer> INCOME_TO_POVERTY_RATIO = new ComparableFieldImpl<>(Identifier.INCOME_TO_POVERTY_RATIO, People::getIncomeToPovertyRatio, People::setIncomeToPovertyRatio, new IntegerIdentityMapper(), false);
    
    /**
     * Returns the id of this People. The id field corresponds to the database
     * column test.test.people.id.
     * 
     * @return the id of this People
     */
    Integer getId();
    
    /**
     * Returns the serialno of this People. The serialno field corresponds to the
     * database column test.test.people.serialno.
     * 
     * @return the serialno of this People
     */
    Integer getSerialno();
    
    /**
     * Returns the state of this People. The state field corresponds to the
     * database column test.test.people.state.
     * 
     * @return the state of this People
     */
    String getState();
    
    /**
     * Returns the incomeAdjustmentCode of this People. The incomeAdjustmentCode
     * field corresponds to the database column
     * test.test.people.income_adjustment_code.
     * 
     * @return the incomeAdjustmentCode of this People
     */
    Integer getIncomeAdjustmentCode();
    
    /**
     * Returns the classOfWorker of this People. The classOfWorker field
     * corresponds to the database column test.test.people.class_of_worker.
     * 
     * @return the classOfWorker of this People
     */
    Optional<String> getClassOfWorker();
    
    /**
     * Returns the dividents of this People. The dividents field corresponds to
     * the database column test.test.people.dividents.
     * 
     * @return the dividents of this People
     */
    Integer getDividents();
    
    /**
     * Returns the allOtherIncomes of this People. The allOtherIncomes field
     * corresponds to the database column test.test.people.all_other_incomes.
     * 
     * @return the allOtherIncomes of this People
     */
    Integer getAllOtherIncomes();
    
    /**
     * Returns the publicAssistanceIncome of this People. The
     * publicAssistanceIncome field corresponds to the database column
     * test.test.people.public_assistance_income.
     * 
     * @return the publicAssistanceIncome of this People
     */
    Integer getPublicAssistanceIncome();
    
    /**
     * Returns the retirementIncome of this People. The retirementIncome field
     * corresponds to the database column test.test.people.retirement_income.
     * 
     * @return the retirementIncome of this People
     */
    Integer getRetirementIncome();
    
    /**
     * Returns the educationalAttainment of this People. The
     * educationalAttainment field corresponds to the database column
     * test.test.people.educational_attainment.
     * 
     * @return the educationalAttainment of this People
     */
    Optional<String> getEducationalAttainment();
    
    /**
     * Returns the selfEmploymentIncome of this People. The selfEmploymentIncome
     * field corresponds to the database column
     * test.test.people.self_employment_income.
     * 
     * @return the selfEmploymentIncome of this People
     */
    Integer getSelfEmploymentIncome();
    
    /**
     * Returns the supplementarySecurityIncome of this People. The
     * supplementarySecurityIncome field corresponds to the database column
     * test.test.people.supplementary_security_income.
     * 
     * @return the supplementarySecurityIncome of this People
     */
    Integer getSupplementarySecurityIncome();
    
    /**
     * Returns the socialSecurityIncome of this People. The socialSecurityIncome
     * field corresponds to the database column
     * test.test.people.social_security_income.
     * 
     * @return the socialSecurityIncome of this People
     */
    Integer getSocialSecurityIncome();
    
    /**
     * Returns the salaryIncome of this People. The salaryIncome field
     * corresponds to the database column test.test.people.salary_income.
     * 
     * @return the salaryIncome of this People
     */
    Integer getSalaryIncome();
    
    /**
     * Returns the sex of this People. The sex field corresponds to the database
     * column test.test.people.sex.
     * 
     * @return the sex of this People
     */
    Optional<String> getSex();
    
    /**
     * Returns the workedHoursPerWeek of this People. The workedHoursPerWeek
     * field corresponds to the database column
     * test.test.people.worked_hours_per_week.
     * 
     * @return the workedHoursPerWeek of this People
     */
    Integer getWorkedHoursPerWeek();
    
    /**
     * Returns the industryRecord of this People. The industryRecord field
     * corresponds to the database column test.test.people.industry_record.
     * 
     * @return the industryRecord of this People
     */
    Optional<String> getIndustryRecord();
    
    /**
     * Returns the naicsIndustryRecord of this People. The naicsIndustryRecord
     * field corresponds to the database column
     * test.test.people.NAICS_industry_record.
     * 
     * @return the naicsIndustryRecord of this People
     */
    Optional<String> getNaicsIndustryRecord();
    
    /**
     * Returns the occupation of this People. The occupation field corresponds to
     * the database column test.test.people.occupation.
     * 
     * @return the occupation of this People
     */
    Optional<String> getOccupation();
    
    /**
     * Returns the totalPersonEarnings of this People. The totalPersonEarnings
     * field corresponds to the database column
     * test.test.people.total_person_earnings.
     * 
     * @return the totalPersonEarnings of this People
     */
    Integer getTotalPersonEarnings();
    
    /**
     * Returns the totalPersonIncome of this People. The totalPersonIncome field
     * corresponds to the database column test.test.people.total_person_income.
     * 
     * @return the totalPersonIncome of this People
     */
    Integer getTotalPersonIncome();
    
    /**
     * Returns the incomeToPovertyRatio of this People. The incomeToPovertyRatio
     * field corresponds to the database column
     * test.test.people.income_to_poverty_ratio.
     * 
     * @return the incomeToPovertyRatio of this People
     */
    Integer getIncomeToPovertyRatio();
    
    /**
     * Sets the id of this People. The id field corresponds to the database
     * column test.test.people.id.
     * 
     * @param id to set of this People
     * @return this People instance
     */
    People setId(Integer id);
    
    /**
     * Sets the serialno of this People. The serialno field corresponds to the
     * database column test.test.people.serialno.
     * 
     * @param serialno to set of this People
     * @return this People instance
     */
    People setSerialno(Integer serialno);
    
    /**
     * Sets the state of this People. The state field corresponds to the database
     * column test.test.people.state.
     * 
     * @param state to set of this People
     * @return this People instance
     */
    People setState(String state);
    
    /**
     * Sets the incomeAdjustmentCode of this People. The incomeAdjustmentCode
     * field corresponds to the database column
     * test.test.people.income_adjustment_code.
     * 
     * @param incomeAdjustmentCode to set of this People
     * @return this People instance
     */
    People setIncomeAdjustmentCode(Integer incomeAdjustmentCode);
    
    /**
     * Sets the classOfWorker of this People. The classOfWorker field corresponds
     * to the database column test.test.people.class_of_worker.
     * 
     * @param classOfWorker to set of this People
     * @return this People instance
     */
    People setClassOfWorker(String classOfWorker);
    
    /**
     * Sets the dividents of this People. The dividents field corresponds to the
     * database column test.test.people.dividents.
     * 
     * @param dividents to set of this People
     * @return this People instance
     */
    People setDividents(Integer dividents);
    
    /**
     * Sets the allOtherIncomes of this People. The allOtherIncomes field
     * corresponds to the database column test.test.people.all_other_incomes.
     * 
     * @param allOtherIncomes to set of this People
     * @return this People instance
     */
    People setAllOtherIncomes(Integer allOtherIncomes);
    
    /**
     * Sets the publicAssistanceIncome of this People. The publicAssistanceIncome
     * field corresponds to the database column
     * test.test.people.public_assistance_income.
     * 
     * @param publicAssistanceIncome to set of this People
     * @return this People instance
     */
    People setPublicAssistanceIncome(Integer publicAssistanceIncome);
    
    /**
     * Sets the retirementIncome of this People. The retirementIncome field
     * corresponds to the database column test.test.people.retirement_income.
     * 
     * @param retirementIncome to set of this People
     * @return this People instance
     */
    People setRetirementIncome(Integer retirementIncome);
    
    /**
     * Sets the educationalAttainment of this People. The educationalAttainment
     * field corresponds to the database column
     * test.test.people.educational_attainment.
     * 
     * @param educationalAttainment to set of this People
     * @return this People instance
     */
    People setEducationalAttainment(String educationalAttainment);
    
    /**
     * Sets the selfEmploymentIncome of this People. The selfEmploymentIncome
     * field corresponds to the database column
     * test.test.people.self_employment_income.
     * 
     * @param selfEmploymentIncome to set of this People
     * @return this People instance
     */
    People setSelfEmploymentIncome(Integer selfEmploymentIncome);
    
    /**
     * Sets the supplementarySecurityIncome of this People. The
     * supplementarySecurityIncome field corresponds to the database column
     * test.test.people.supplementary_security_income.
     * 
     * @param supplementarySecurityIncome to set of this People
     * @return this People instance
     */
    People setSupplementarySecurityIncome(Integer supplementarySecurityIncome);
    
    /**
     * Sets the socialSecurityIncome of this People. The socialSecurityIncome
     * field corresponds to the database column
     * test.test.people.social_security_income.
     * 
     * @param socialSecurityIncome to set of this People
     * @return this People instance
     */
    People setSocialSecurityIncome(Integer socialSecurityIncome);
    
    /**
     * Sets the salaryIncome of this People. The salaryIncome field corresponds
     * to the database column test.test.people.salary_income.
     * 
     * @param salaryIncome to set of this People
     * @return this People instance
     */
    People setSalaryIncome(Integer salaryIncome);
    
    /**
     * Sets the sex of this People. The sex field corresponds to the database
     * column test.test.people.sex.
     * 
     * @param sex to set of this People
     * @return this People instance
     */
    People setSex(String sex);
    
    /**
     * Sets the workedHoursPerWeek of this People. The workedHoursPerWeek field
     * corresponds to the database column test.test.people.worked_hours_per_week.
     * 
     * @param workedHoursPerWeek to set of this People
     * @return this People instance
     */
    People setWorkedHoursPerWeek(Integer workedHoursPerWeek);
    
    /**
     * Sets the industryRecord of this People. The industryRecord field
     * corresponds to the database column test.test.people.industry_record.
     * 
     * @param industryRecord to set of this People
     * @return this People instance
     */
    People setIndustryRecord(String industryRecord);
    
    /**
     * Sets the naicsIndustryRecord of this People. The naicsIndustryRecord field
     * corresponds to the database column test.test.people.NAICS_industry_record.
     * 
     * @param naicsIndustryRecord to set of this People
     * @return this People instance
     */
    People setNaicsIndustryRecord(String naicsIndustryRecord);
    
    /**
     * Sets the occupation of this People. The occupation field corresponds to
     * the database column test.test.people.occupation.
     * 
     * @param occupation to set of this People
     * @return this People instance
     */
    People setOccupation(String occupation);
    
    /**
     * Sets the totalPersonEarnings of this People. The totalPersonEarnings field
     * corresponds to the database column test.test.people.total_person_earnings.
     * 
     * @param totalPersonEarnings to set of this People
     * @return this People instance
     */
    People setTotalPersonEarnings(Integer totalPersonEarnings);
    
    /**
     * Sets the totalPersonIncome of this People. The totalPersonIncome field
     * corresponds to the database column test.test.people.total_person_income.
     * 
     * @param totalPersonIncome to set of this People
     * @return this People instance
     */
    People setTotalPersonIncome(Integer totalPersonIncome);
    
    /**
     * Sets the incomeToPovertyRatio of this People. The incomeToPovertyRatio
     * field corresponds to the database column
     * test.test.people.income_to_poverty_ratio.
     * 
     * @param incomeToPovertyRatio to set of this People
     * @return this People instance
     */
    People setIncomeToPovertyRatio(Integer incomeToPovertyRatio);
    
    enum Identifier implements FieldIdentifier<People> {
        
        ID ("id"),
        SERIALNO ("serialno"),
        STATE ("state"),
        INCOME_ADJUSTMENT_CODE ("income_adjustment_code"),
        CLASS_OF_WORKER ("class_of_worker"),
        DIVIDENTS ("dividents"),
        ALL_OTHER_INCOMES ("all_other_incomes"),
        PUBLIC_ASSISTANCE_INCOME ("public_assistance_income"),
        RETIREMENT_INCOME ("retirement_income"),
        EDUCATIONAL_ATTAINMENT ("educational_attainment"),
        SELF_EMPLOYMENT_INCOME ("self_employment_income"),
        SUPPLEMENTARY_SECURITY_INCOME ("supplementary_security_income"),
        SOCIAL_SECURITY_INCOME ("social_security_income"),
        SALARY_INCOME ("salary_income"),
        SEX ("sex"),
        WORKED_HOURS_PER_WEEK ("worked_hours_per_week"),
        INDUSTRY_RECORD ("industry_record"),
        NAICS_INDUSTRY_RECORD ("NAICS_industry_record"),
        OCCUPATION ("occupation"),
        TOTAL_PERSON_EARNINGS ("total_person_earnings"),
        TOTAL_PERSON_INCOME ("total_person_income"),
        INCOME_TO_POVERTY_RATIO ("income_to_poverty_ratio");
        
        private final String columnName;
        
        Identifier(String columnName) {
            this.columnName = columnName;
        }
        
        @Override
        public String dbmsName() {
            return "test";
        }
        
        @Override
        public String schemaName() {
            return "test";
        }
        
        @Override
        public String tableName() {
            return "people";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}