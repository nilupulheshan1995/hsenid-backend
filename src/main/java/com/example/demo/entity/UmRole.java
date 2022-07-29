
package com.example.demo.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "um_role")
public class UmRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "role_id")
    private Integer roleId;

    @Basic(optional = false)
    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @OneToMany(mappedBy = "role")
    private Collection<UmUser> umUserCollection;

    public UmRole() {
    }

    public UmRole(Integer roleId) {
        this.roleId = roleId;
    }

    public UmRole(Integer roleId, String name) {
        this.roleId = roleId;
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<UmUser> getUmUserCollection() {
        return umUserCollection;
    }

    public void setUmUserCollection(Collection<UmUser> umUserCollection) {
        this.umUserCollection = umUserCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UmRole)) {
            return false;
        }
        UmRole other = (UmRole) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.UmRole[ roleId=" + roleId + " ]";
    }
    
}
