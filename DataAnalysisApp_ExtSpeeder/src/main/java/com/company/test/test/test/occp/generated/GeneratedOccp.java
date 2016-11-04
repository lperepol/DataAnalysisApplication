package com.company.test.test.test.occp.generated;

import com.company.test.test.test.occp.Occp;
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
 * in the Table test.test.test.occp.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public interface GeneratedOccp extends Entity<Occp> {
    
    /**
     * This Field corresponds to the {@link Occp} field that can be obtained
     * using the {@link Occp#getId()} method.
     */
    final ComparableField<Occp, Integer, Integer> ID = new ComparableFieldImpl<>(Identifier.ID, Occp::getId, Occp::setId, new IntegerIdentityMapper(), true);
    /**
     * This Field corresponds to the {@link Occp} field that can be obtained
     * using the {@link Occp#getDescription()} method.
     */
    final StringField<Occp, String> DESCRIPTION = new StringFieldImpl<>(Identifier.DESCRIPTION, o -> o.getDescription().orElse(null), Occp::setDescription, new StringIdentityMapper(), false);
    
    /**
     * Returns the id of this Occp. The id field corresponds to the database
     * column test.test.occp.id.
     * 
     * @return the id of this Occp
     */
    Integer getId();
    
    /**
     * Returns the description of this Occp. The description field corresponds to
     * the database column test.test.occp.description.
     * 
     * @return the description of this Occp
     */
    Optional<String> getDescription();
    
    /**
     * Sets the id of this Occp. The id field corresponds to the database column
     * test.test.occp.id.
     * 
     * @param id to set of this Occp
     * @return this Occp instance
     */
    Occp setId(Integer id);
    
    /**
     * Sets the description of this Occp. The description field corresponds to
     * the database column test.test.occp.description.
     * 
     * @param description to set of this Occp
     * @return this Occp instance
     */
    Occp setDescription(String description);
    
    enum Identifier implements FieldIdentifier<Occp> {
        
        ID ("id"),
        DESCRIPTION ("description");
        
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
            return "occp";
        }
        
        @Override
        public String columnName() {
            return this.columnName;
        }
    }
}