package com.company.test.test.test.bld.generated;

import com.company.test.test.test.bld.Bld;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table test.test.test.bld.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedBldImpl extends AbstractBaseEntity<Bld> implements Bld {
    
    private Integer id;
    private String description;
    
    protected GeneratedBldImpl() {
        
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public final Bld setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public final Bld setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("description = "+Objects.toString(getDescription().orElse(null)));
        return "BldImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Bld)) { return false; }
        final Bld thatBld = (Bld)that;
        if (!Objects.equals(this.getId(), thatBld.getId())) {return false; }
        if (!Objects.equals(this.getDescription(), thatBld.getDescription())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getDescription());
        return hash;
    }
    
    @Override
    public Class<Bld> entityClass() {
        return Bld.class;
    }
}