package com.company.test.test.test.houses.generated;

import com.company.test.test.test.houses.Houses;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table test.test.test.houses.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedHousesImpl extends AbstractBaseEntity<Houses> implements Houses {
    
    private Integer serial;
    private String state;
    private String building;
    private Integer housingAdjustmentCode;
    private Integer incomeAdjusmentCode;
    private Integer condoFee;
    private Integer numberOfRooms;
    private Integer mounthlyRent;
    private Integer propertyValue;
    private String yearOfCreation;
    private Integer familyIncome;
    private Integer grossRent;
    private Integer grossRentAsPercentage;
    private Integer householdIncome;
    private Integer mountlyOwnerCostAsPercentage;
    private Integer mounthlyOwnerCost;
    private String propertyTaxes;
    
    protected GeneratedHousesImpl() {
        
    }
    
    @Override
    public Integer getSerial() {
        return serial;
    }
    
    @Override
    public String getState() {
        return state;
    }
    
    @Override
    public Optional<String> getBuilding() {
        return Optional.ofNullable(building);
    }
    
    @Override
    public Integer getHousingAdjustmentCode() {
        return housingAdjustmentCode;
    }
    
    @Override
    public Integer getIncomeAdjusmentCode() {
        return incomeAdjusmentCode;
    }
    
    @Override
    public Integer getCondoFee() {
        return condoFee;
    }
    
    @Override
    public Integer getNumberOfRooms() {
        return numberOfRooms;
    }
    
    @Override
    public Integer getMounthlyRent() {
        return mounthlyRent;
    }
    
    @Override
    public Integer getPropertyValue() {
        return propertyValue;
    }
    
    @Override
    public Optional<String> getYearOfCreation() {
        return Optional.ofNullable(yearOfCreation);
    }
    
    @Override
    public Integer getFamilyIncome() {
        return familyIncome;
    }
    
    @Override
    public Integer getGrossRent() {
        return grossRent;
    }
    
    @Override
    public Integer getGrossRentAsPercentage() {
        return grossRentAsPercentage;
    }
    
    @Override
    public Integer getHouseholdIncome() {
        return householdIncome;
    }
    
    @Override
    public Integer getMountlyOwnerCostAsPercentage() {
        return mountlyOwnerCostAsPercentage;
    }
    
    @Override
    public Integer getMounthlyOwnerCost() {
        return mounthlyOwnerCost;
    }
    
    @Override
    public Optional<String> getPropertyTaxes() {
        return Optional.ofNullable(propertyTaxes);
    }
    
    @Override
    public final Houses setSerial(Integer serial) {
        this.serial = serial;
        return this;
    }
    
    @Override
    public final Houses setState(String state) {
        this.state = state;
        return this;
    }
    
    @Override
    public final Houses setBuilding(String building) {
        this.building = building;
        return this;
    }
    
    @Override
    public final Houses setHousingAdjustmentCode(Integer housingAdjustmentCode) {
        this.housingAdjustmentCode = housingAdjustmentCode;
        return this;
    }
    
    @Override
    public final Houses setIncomeAdjusmentCode(Integer incomeAdjusmentCode) {
        this.incomeAdjusmentCode = incomeAdjusmentCode;
        return this;
    }
    
    @Override
    public final Houses setCondoFee(Integer condoFee) {
        this.condoFee = condoFee;
        return this;
    }
    
    @Override
    public final Houses setNumberOfRooms(Integer numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }
    
    @Override
    public final Houses setMounthlyRent(Integer mounthlyRent) {
        this.mounthlyRent = mounthlyRent;
        return this;
    }
    
    @Override
    public final Houses setPropertyValue(Integer propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    
    @Override
    public final Houses setYearOfCreation(String yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
        return this;
    }
    
    @Override
    public final Houses setFamilyIncome(Integer familyIncome) {
        this.familyIncome = familyIncome;
        return this;
    }
    
    @Override
    public final Houses setGrossRent(Integer grossRent) {
        this.grossRent = grossRent;
        return this;
    }
    
    @Override
    public final Houses setGrossRentAsPercentage(Integer grossRentAsPercentage) {
        this.grossRentAsPercentage = grossRentAsPercentage;
        return this;
    }
    
    @Override
    public final Houses setHouseholdIncome(Integer householdIncome) {
        this.householdIncome = householdIncome;
        return this;
    }
    
    @Override
    public final Houses setMountlyOwnerCostAsPercentage(Integer mountlyOwnerCostAsPercentage) {
        this.mountlyOwnerCostAsPercentage = mountlyOwnerCostAsPercentage;
        return this;
    }
    
    @Override
    public final Houses setMounthlyOwnerCost(Integer mounthlyOwnerCost) {
        this.mounthlyOwnerCost = mounthlyOwnerCost;
        return this;
    }
    
    @Override
    public final Houses setPropertyTaxes(String propertyTaxes) {
        this.propertyTaxes = propertyTaxes;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("serial = "+Objects.toString(getSerial()));
        sj.add("state = "+Objects.toString(getState()));
        sj.add("building = "+Objects.toString(getBuilding().orElse(null)));
        sj.add("housingAdjustmentCode = "+Objects.toString(getHousingAdjustmentCode()));
        sj.add("incomeAdjusmentCode = "+Objects.toString(getIncomeAdjusmentCode()));
        sj.add("condoFee = "+Objects.toString(getCondoFee()));
        sj.add("numberOfRooms = "+Objects.toString(getNumberOfRooms()));
        sj.add("mounthlyRent = "+Objects.toString(getMounthlyRent()));
        sj.add("propertyValue = "+Objects.toString(getPropertyValue()));
        sj.add("yearOfCreation = "+Objects.toString(getYearOfCreation().orElse(null)));
        sj.add("familyIncome = "+Objects.toString(getFamilyIncome()));
        sj.add("grossRent = "+Objects.toString(getGrossRent()));
        sj.add("grossRentAsPercentage = "+Objects.toString(getGrossRentAsPercentage()));
        sj.add("householdIncome = "+Objects.toString(getHouseholdIncome()));
        sj.add("mountlyOwnerCostAsPercentage = "+Objects.toString(getMountlyOwnerCostAsPercentage()));
        sj.add("mounthlyOwnerCost = "+Objects.toString(getMounthlyOwnerCost()));
        sj.add("propertyTaxes = "+Objects.toString(getPropertyTaxes().orElse(null)));
        return "HousesImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Houses)) { return false; }
        final Houses thatHouses = (Houses)that;
        if (!Objects.equals(this.getSerial(), thatHouses.getSerial())) {return false; }
        if (!Objects.equals(this.getState(), thatHouses.getState())) {return false; }
        if (!Objects.equals(this.getBuilding(), thatHouses.getBuilding())) {return false; }
        if (!Objects.equals(this.getHousingAdjustmentCode(), thatHouses.getHousingAdjustmentCode())) {return false; }
        if (!Objects.equals(this.getIncomeAdjusmentCode(), thatHouses.getIncomeAdjusmentCode())) {return false; }
        if (!Objects.equals(this.getCondoFee(), thatHouses.getCondoFee())) {return false; }
        if (!Objects.equals(this.getNumberOfRooms(), thatHouses.getNumberOfRooms())) {return false; }
        if (!Objects.equals(this.getMounthlyRent(), thatHouses.getMounthlyRent())) {return false; }
        if (!Objects.equals(this.getPropertyValue(), thatHouses.getPropertyValue())) {return false; }
        if (!Objects.equals(this.getYearOfCreation(), thatHouses.getYearOfCreation())) {return false; }
        if (!Objects.equals(this.getFamilyIncome(), thatHouses.getFamilyIncome())) {return false; }
        if (!Objects.equals(this.getGrossRent(), thatHouses.getGrossRent())) {return false; }
        if (!Objects.equals(this.getGrossRentAsPercentage(), thatHouses.getGrossRentAsPercentage())) {return false; }
        if (!Objects.equals(this.getHouseholdIncome(), thatHouses.getHouseholdIncome())) {return false; }
        if (!Objects.equals(this.getMountlyOwnerCostAsPercentage(), thatHouses.getMountlyOwnerCostAsPercentage())) {return false; }
        if (!Objects.equals(this.getMounthlyOwnerCost(), thatHouses.getMounthlyOwnerCost())) {return false; }
        if (!Objects.equals(this.getPropertyTaxes(), thatHouses.getPropertyTaxes())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getSerial());
        hash = 31 * hash + Objects.hashCode(getState());
        hash = 31 * hash + Objects.hashCode(getBuilding());
        hash = 31 * hash + Objects.hashCode(getHousingAdjustmentCode());
        hash = 31 * hash + Objects.hashCode(getIncomeAdjusmentCode());
        hash = 31 * hash + Objects.hashCode(getCondoFee());
        hash = 31 * hash + Objects.hashCode(getNumberOfRooms());
        hash = 31 * hash + Objects.hashCode(getMounthlyRent());
        hash = 31 * hash + Objects.hashCode(getPropertyValue());
        hash = 31 * hash + Objects.hashCode(getYearOfCreation());
        hash = 31 * hash + Objects.hashCode(getFamilyIncome());
        hash = 31 * hash + Objects.hashCode(getGrossRent());
        hash = 31 * hash + Objects.hashCode(getGrossRentAsPercentage());
        hash = 31 * hash + Objects.hashCode(getHouseholdIncome());
        hash = 31 * hash + Objects.hashCode(getMountlyOwnerCostAsPercentage());
        hash = 31 * hash + Objects.hashCode(getMounthlyOwnerCost());
        hash = 31 * hash + Objects.hashCode(getPropertyTaxes());
        return hash;
    }
    
    @Override
    public Class<Houses> entityClass() {
        return Houses.class;
    }
}