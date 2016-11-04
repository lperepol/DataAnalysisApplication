package com.company.test.test.test.houses.generated;

import com.company.test.test.test.houses.Houses;
import com.company.test.test.test.houses.HousesImpl;
import com.speedment.Speedment;
import com.speedment.exception.SpeedmentException;
import com.speedment.field.FieldIdentifier;
import com.speedment.field.trait.FieldTrait;
import com.speedment.plugin.extspeeder.runtime.manager.AbstractExtSpeederSqlManager;
import com.speedment.util.tuple.Tuple1;
import com.speedment.util.tuple.Tuples;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.stream.Stream;
import javax.annotation.Generated;
import static com.speedment.internal.util.sql.ResultSetUtil.*;

/**
 * The generated base manager implementation representing an entity (for
 * example, a row) in the Table test.test.test.houses.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedHousesManagerImpl extends AbstractExtSpeederSqlManager<Houses> implements GeneratedHousesManager {
    
    private final static Tuple1<Class<Integer>> PRIMARY_KEY_CLASSES = Tuples.of(Integer.class);
    
    protected GeneratedHousesManagerImpl(Speedment speedment) {
        super(speedment);
        setEntityMapper(this::newEntityFrom);
    }
    
    protected Houses newEntityFrom(ResultSet resultSet) throws SpeedmentException, SQLException {
        final Houses entity = newEmptyEntity();
        try {
            entity.setSerial(resultSet.getInt(1));
            entity.setState(resultSet.getString(2));
            entity.setBuilding(resultSet.getString(3));
            entity.setHousingAdjustmentCode(resultSet.getInt(4));
            entity.setIncomeAdjusmentCode(resultSet.getInt(5));
            entity.setCondoFee(resultSet.getInt(6));
            entity.setNumberOfRooms(resultSet.getInt(7));
            entity.setMounthlyRent(resultSet.getInt(8));
            entity.setPropertyValue(resultSet.getInt(9));
            entity.setYearOfCreation(resultSet.getString(10));
            entity.setFamilyIncome(resultSet.getInt(11));
            entity.setGrossRent(resultSet.getInt(12));
            entity.setGrossRentAsPercentage(resultSet.getInt(13));
            entity.setHouseholdIncome(resultSet.getInt(14));
            entity.setMountlyOwnerCostAsPercentage(resultSet.getInt(15));
            entity.setMounthlyOwnerCost(resultSet.getInt(16));
            entity.setPropertyTaxes(resultSet.getString(17));
        }
        catch (SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    @Override
    public Houses newEmptyEntity() {
        return new HousesImpl() {
            @Override
            protected Speedment speedment() {
                return speedment;
            }
        };
    }
    
    @Override
    public Object get(Houses entity, FieldIdentifier<Houses> identifier) {
        switch ((Houses.Identifier) identifier) {
            case SERIAL : return entity.getSerial();
            case STATE : return entity.getState();
            case BUILDING : return entity.getBuilding().orElse(null);
            case HOUSING_ADJUSTMENT_CODE : return entity.getHousingAdjustmentCode();
            case INCOME_ADJUSMENT_CODE : return entity.getIncomeAdjusmentCode();
            case CONDO_FEE : return entity.getCondoFee();
            case NUMBER_OF_ROOMS : return entity.getNumberOfRooms();
            case MOUNTHLY_RENT : return entity.getMounthlyRent();
            case PROPERTY_VALUE : return entity.getPropertyValue();
            case YEAR_OF_CREATION : return entity.getYearOfCreation().orElse(null);
            case FAMILY_INCOME : return entity.getFamilyIncome();
            case GROSS_RENT : return entity.getGrossRent();
            case GROSS_RENT_AS_PERCENTAGE : return entity.getGrossRentAsPercentage();
            case HOUSEHOLD_INCOME : return entity.getHouseholdIncome();
            case MOUNTLY_OWNER_COST_AS_PERCENTAGE : return entity.getMountlyOwnerCostAsPercentage();
            case MOUNTHLY_OWNER_COST : return entity.getMounthlyOwnerCost();
            case PROPERTY_TAXES : return entity.getPropertyTaxes().orElse(null);
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public void set(Houses entity, FieldIdentifier<Houses> identifier, Object value) {
        switch ((Houses.Identifier) identifier) {
            case SERIAL : entity.setSerial((Integer) value); break;
            case STATE : entity.setState((String) value); break;
            case BUILDING : entity.setBuilding((String) value); break;
            case HOUSING_ADJUSTMENT_CODE : entity.setHousingAdjustmentCode((Integer) value); break;
            case INCOME_ADJUSMENT_CODE : entity.setIncomeAdjusmentCode((Integer) value); break;
            case CONDO_FEE : entity.setCondoFee((Integer) value); break;
            case NUMBER_OF_ROOMS : entity.setNumberOfRooms((Integer) value); break;
            case MOUNTHLY_RENT : entity.setMounthlyRent((Integer) value); break;
            case PROPERTY_VALUE : entity.setPropertyValue((Integer) value); break;
            case YEAR_OF_CREATION : entity.setYearOfCreation((String) value); break;
            case FAMILY_INCOME : entity.setFamilyIncome((Integer) value); break;
            case GROSS_RENT : entity.setGrossRent((Integer) value); break;
            case GROSS_RENT_AS_PERCENTAGE : entity.setGrossRentAsPercentage((Integer) value); break;
            case HOUSEHOLD_INCOME : entity.setHouseholdIncome((Integer) value); break;
            case MOUNTLY_OWNER_COST_AS_PERCENTAGE : entity.setMountlyOwnerCostAsPercentage((Integer) value); break;
            case MOUNTHLY_OWNER_COST : entity.setMounthlyOwnerCost((Integer) value); break;
            case PROPERTY_TAXES : entity.setPropertyTaxes((String) value); break;
            default : throw new IllegalArgumentException("Unknown identifier '" + identifier + "'.");
        }
    }
    
    @Override
    public Stream<FieldTrait> fields() {
        return Stream.of(
            Houses.SERIAL,
            Houses.STATE,
            Houses.BUILDING,
            Houses.HOUSING_ADJUSTMENT_CODE,
            Houses.INCOME_ADJUSMENT_CODE,
            Houses.CONDO_FEE,
            Houses.NUMBER_OF_ROOMS,
            Houses.MOUNTHLY_RENT,
            Houses.PROPERTY_VALUE,
            Houses.YEAR_OF_CREATION,
            Houses.FAMILY_INCOME,
            Houses.GROSS_RENT,
            Houses.GROSS_RENT_AS_PERCENTAGE,
            Houses.HOUSEHOLD_INCOME,
            Houses.MOUNTLY_OWNER_COST_AS_PERCENTAGE,
            Houses.MOUNTHLY_OWNER_COST,
            Houses.PROPERTY_TAXES
        );
    }
    
    @Override
    public Stream<FieldTrait> primaryKeyFields() {
        return Stream.of(
            Houses.SERIAL
        );
    }
    
    @Override
    public Tuple1<Class<Integer>> getPrimaryKeyClasses() {
        return PRIMARY_KEY_CLASSES;
    }
    
    @Override
    public Houses newCopyOf(Houses source) {
        final Houses copy = new HousesImpl() {
            @Override
            protected final Speedment speedment() {
                return speedment;
            }
        };
        
        copy.setSerial(source.getSerial());
        copy.setState(source.getState());
        source.getBuilding().ifPresent(copy::setBuilding);
        copy.setHousingAdjustmentCode(source.getHousingAdjustmentCode());
        copy.setIncomeAdjusmentCode(source.getIncomeAdjusmentCode());
        copy.setCondoFee(source.getCondoFee());
        copy.setNumberOfRooms(source.getNumberOfRooms());
        copy.setMounthlyRent(source.getMounthlyRent());
        copy.setPropertyValue(source.getPropertyValue());
        source.getYearOfCreation().ifPresent(copy::setYearOfCreation);
        copy.setFamilyIncome(source.getFamilyIncome());
        copy.setGrossRent(source.getGrossRent());
        copy.setGrossRentAsPercentage(source.getGrossRentAsPercentage());
        copy.setHouseholdIncome(source.getHouseholdIncome());
        copy.setMountlyOwnerCostAsPercentage(source.getMountlyOwnerCostAsPercentage());
        copy.setMounthlyOwnerCost(source.getMounthlyOwnerCost());
        source.getPropertyTaxes().ifPresent(copy::setPropertyTaxes);
        
        return copy;
    }
}