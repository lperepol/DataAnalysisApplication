package com.company.test.test.test.people.generated;

import com.company.test.test.test.people.People;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table test.test.test.people.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedPeopleImpl extends AbstractBaseEntity<People> implements People {
    
    private Integer id;
    private Integer serialno;
    private String state;
    private Integer incomeAdjustmentCode;
    private String classOfWorker;
    private Integer dividents;
    private Integer allOtherIncomes;
    private Integer publicAssistanceIncome;
    private Integer retirementIncome;
    private String educationalAttainment;
    private Integer selfEmploymentIncome;
    private Integer supplementarySecurityIncome;
    private Integer socialSecurityIncome;
    private Integer salaryIncome;
    private String sex;
    private Integer workedHoursPerWeek;
    private String industryRecord;
    private String naicsIndustryRecord;
    private String occupation;
    private Integer totalPersonEarnings;
    private Integer totalPersonIncome;
    private Integer incomeToPovertyRatio;
    
    protected GeneratedPeopleImpl() {
        
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public Integer getSerialno() {
        return serialno;
    }
    
    @Override
    public String getState() {
        return state;
    }
    
    @Override
    public Integer getIncomeAdjustmentCode() {
        return incomeAdjustmentCode;
    }
    
    @Override
    public Optional<String> getClassOfWorker() {
        return Optional.ofNullable(classOfWorker);
    }
    
    @Override
    public Integer getDividents() {
        return dividents;
    }
    
    @Override
    public Integer getAllOtherIncomes() {
        return allOtherIncomes;
    }
    
    @Override
    public Integer getPublicAssistanceIncome() {
        return publicAssistanceIncome;
    }
    
    @Override
    public Integer getRetirementIncome() {
        return retirementIncome;
    }
    
    @Override
    public Optional<String> getEducationalAttainment() {
        return Optional.ofNullable(educationalAttainment);
    }
    
    @Override
    public Integer getSelfEmploymentIncome() {
        return selfEmploymentIncome;
    }
    
    @Override
    public Integer getSupplementarySecurityIncome() {
        return supplementarySecurityIncome;
    }
    
    @Override
    public Integer getSocialSecurityIncome() {
        return socialSecurityIncome;
    }
    
    @Override
    public Integer getSalaryIncome() {
        return salaryIncome;
    }
    
    @Override
    public Optional<String> getSex() {
        return Optional.ofNullable(sex);
    }
    
    @Override
    public Integer getWorkedHoursPerWeek() {
        return workedHoursPerWeek;
    }
    
    @Override
    public Optional<String> getIndustryRecord() {
        return Optional.ofNullable(industryRecord);
    }
    
    @Override
    public Optional<String> getNaicsIndustryRecord() {
        return Optional.ofNullable(naicsIndustryRecord);
    }
    
    @Override
    public Optional<String> getOccupation() {
        return Optional.ofNullable(occupation);
    }
    
    @Override
    public Integer getTotalPersonEarnings() {
        return totalPersonEarnings;
    }
    
    @Override
    public Integer getTotalPersonIncome() {
        return totalPersonIncome;
    }
    
    @Override
    public Integer getIncomeToPovertyRatio() {
        return incomeToPovertyRatio;
    }
    
    @Override
    public final People setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public final People setSerialno(Integer serialno) {
        this.serialno = serialno;
        return this;
    }
    
    @Override
    public final People setState(String state) {
        this.state = state;
        return this;
    }
    
    @Override
    public final People setIncomeAdjustmentCode(Integer incomeAdjustmentCode) {
        this.incomeAdjustmentCode = incomeAdjustmentCode;
        return this;
    }
    
    @Override
    public final People setClassOfWorker(String classOfWorker) {
        this.classOfWorker = classOfWorker;
        return this;
    }
    
    @Override
    public final People setDividents(Integer dividents) {
        this.dividents = dividents;
        return this;
    }
    
    @Override
    public final People setAllOtherIncomes(Integer allOtherIncomes) {
        this.allOtherIncomes = allOtherIncomes;
        return this;
    }
    
    @Override
    public final People setPublicAssistanceIncome(Integer publicAssistanceIncome) {
        this.publicAssistanceIncome = publicAssistanceIncome;
        return this;
    }
    
    @Override
    public final People setRetirementIncome(Integer retirementIncome) {
        this.retirementIncome = retirementIncome;
        return this;
    }
    
    @Override
    public final People setEducationalAttainment(String educationalAttainment) {
        this.educationalAttainment = educationalAttainment;
        return this;
    }
    
    @Override
    public final People setSelfEmploymentIncome(Integer selfEmploymentIncome) {
        this.selfEmploymentIncome = selfEmploymentIncome;
        return this;
    }
    
    @Override
    public final People setSupplementarySecurityIncome(Integer supplementarySecurityIncome) {
        this.supplementarySecurityIncome = supplementarySecurityIncome;
        return this;
    }
    
    @Override
    public final People setSocialSecurityIncome(Integer socialSecurityIncome) {
        this.socialSecurityIncome = socialSecurityIncome;
        return this;
    }
    
    @Override
    public final People setSalaryIncome(Integer salaryIncome) {
        this.salaryIncome = salaryIncome;
        return this;
    }
    
    @Override
    public final People setSex(String sex) {
        this.sex = sex;
        return this;
    }
    
    @Override
    public final People setWorkedHoursPerWeek(Integer workedHoursPerWeek) {
        this.workedHoursPerWeek = workedHoursPerWeek;
        return this;
    }
    
    @Override
    public final People setIndustryRecord(String industryRecord) {
        this.industryRecord = industryRecord;
        return this;
    }
    
    @Override
    public final People setNaicsIndustryRecord(String naicsIndustryRecord) {
        this.naicsIndustryRecord = naicsIndustryRecord;
        return this;
    }
    
    @Override
    public final People setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }
    
    @Override
    public final People setTotalPersonEarnings(Integer totalPersonEarnings) {
        this.totalPersonEarnings = totalPersonEarnings;
        return this;
    }
    
    @Override
    public final People setTotalPersonIncome(Integer totalPersonIncome) {
        this.totalPersonIncome = totalPersonIncome;
        return this;
    }
    
    @Override
    public final People setIncomeToPovertyRatio(Integer incomeToPovertyRatio) {
        this.incomeToPovertyRatio = incomeToPovertyRatio;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("serialno = "+Objects.toString(getSerialno()));
        sj.add("state = "+Objects.toString(getState()));
        sj.add("incomeAdjustmentCode = "+Objects.toString(getIncomeAdjustmentCode()));
        sj.add("classOfWorker = "+Objects.toString(getClassOfWorker().orElse(null)));
        sj.add("dividents = "+Objects.toString(getDividents()));
        sj.add("allOtherIncomes = "+Objects.toString(getAllOtherIncomes()));
        sj.add("publicAssistanceIncome = "+Objects.toString(getPublicAssistanceIncome()));
        sj.add("retirementIncome = "+Objects.toString(getRetirementIncome()));
        sj.add("educationalAttainment = "+Objects.toString(getEducationalAttainment().orElse(null)));
        sj.add("selfEmploymentIncome = "+Objects.toString(getSelfEmploymentIncome()));
        sj.add("supplementarySecurityIncome = "+Objects.toString(getSupplementarySecurityIncome()));
        sj.add("socialSecurityIncome = "+Objects.toString(getSocialSecurityIncome()));
        sj.add("salaryIncome = "+Objects.toString(getSalaryIncome()));
        sj.add("sex = "+Objects.toString(getSex().orElse(null)));
        sj.add("workedHoursPerWeek = "+Objects.toString(getWorkedHoursPerWeek()));
        sj.add("industryRecord = "+Objects.toString(getIndustryRecord().orElse(null)));
        sj.add("naicsIndustryRecord = "+Objects.toString(getNaicsIndustryRecord().orElse(null)));
        sj.add("occupation = "+Objects.toString(getOccupation().orElse(null)));
        sj.add("totalPersonEarnings = "+Objects.toString(getTotalPersonEarnings()));
        sj.add("totalPersonIncome = "+Objects.toString(getTotalPersonIncome()));
        sj.add("incomeToPovertyRatio = "+Objects.toString(getIncomeToPovertyRatio()));
        return "PeopleImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof People)) { return false; }
        final People thatPeople = (People)that;
        if (!Objects.equals(this.getId(), thatPeople.getId())) {return false; }
        if (!Objects.equals(this.getSerialno(), thatPeople.getSerialno())) {return false; }
        if (!Objects.equals(this.getState(), thatPeople.getState())) {return false; }
        if (!Objects.equals(this.getIncomeAdjustmentCode(), thatPeople.getIncomeAdjustmentCode())) {return false; }
        if (!Objects.equals(this.getClassOfWorker(), thatPeople.getClassOfWorker())) {return false; }
        if (!Objects.equals(this.getDividents(), thatPeople.getDividents())) {return false; }
        if (!Objects.equals(this.getAllOtherIncomes(), thatPeople.getAllOtherIncomes())) {return false; }
        if (!Objects.equals(this.getPublicAssistanceIncome(), thatPeople.getPublicAssistanceIncome())) {return false; }
        if (!Objects.equals(this.getRetirementIncome(), thatPeople.getRetirementIncome())) {return false; }
        if (!Objects.equals(this.getEducationalAttainment(), thatPeople.getEducationalAttainment())) {return false; }
        if (!Objects.equals(this.getSelfEmploymentIncome(), thatPeople.getSelfEmploymentIncome())) {return false; }
        if (!Objects.equals(this.getSupplementarySecurityIncome(), thatPeople.getSupplementarySecurityIncome())) {return false; }
        if (!Objects.equals(this.getSocialSecurityIncome(), thatPeople.getSocialSecurityIncome())) {return false; }
        if (!Objects.equals(this.getSalaryIncome(), thatPeople.getSalaryIncome())) {return false; }
        if (!Objects.equals(this.getSex(), thatPeople.getSex())) {return false; }
        if (!Objects.equals(this.getWorkedHoursPerWeek(), thatPeople.getWorkedHoursPerWeek())) {return false; }
        if (!Objects.equals(this.getIndustryRecord(), thatPeople.getIndustryRecord())) {return false; }
        if (!Objects.equals(this.getNaicsIndustryRecord(), thatPeople.getNaicsIndustryRecord())) {return false; }
        if (!Objects.equals(this.getOccupation(), thatPeople.getOccupation())) {return false; }
        if (!Objects.equals(this.getTotalPersonEarnings(), thatPeople.getTotalPersonEarnings())) {return false; }
        if (!Objects.equals(this.getTotalPersonIncome(), thatPeople.getTotalPersonIncome())) {return false; }
        if (!Objects.equals(this.getIncomeToPovertyRatio(), thatPeople.getIncomeToPovertyRatio())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getSerialno());
        hash = 31 * hash + Objects.hashCode(getState());
        hash = 31 * hash + Objects.hashCode(getIncomeAdjustmentCode());
        hash = 31 * hash + Objects.hashCode(getClassOfWorker());
        hash = 31 * hash + Objects.hashCode(getDividents());
        hash = 31 * hash + Objects.hashCode(getAllOtherIncomes());
        hash = 31 * hash + Objects.hashCode(getPublicAssistanceIncome());
        hash = 31 * hash + Objects.hashCode(getRetirementIncome());
        hash = 31 * hash + Objects.hashCode(getEducationalAttainment());
        hash = 31 * hash + Objects.hashCode(getSelfEmploymentIncome());
        hash = 31 * hash + Objects.hashCode(getSupplementarySecurityIncome());
        hash = 31 * hash + Objects.hashCode(getSocialSecurityIncome());
        hash = 31 * hash + Objects.hashCode(getSalaryIncome());
        hash = 31 * hash + Objects.hashCode(getSex());
        hash = 31 * hash + Objects.hashCode(getWorkedHoursPerWeek());
        hash = 31 * hash + Objects.hashCode(getIndustryRecord());
        hash = 31 * hash + Objects.hashCode(getNaicsIndustryRecord());
        hash = 31 * hash + Objects.hashCode(getOccupation());
        hash = 31 * hash + Objects.hashCode(getTotalPersonEarnings());
        hash = 31 * hash + Objects.hashCode(getTotalPersonIncome());
        hash = 31 * hash + Objects.hashCode(getIncomeToPovertyRatio());
        return hash;
    }
    
    @Override
    public Class<People> entityClass() {
        return People.class;
    }
}