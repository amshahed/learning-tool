/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningtool;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Shahed
 */
@Entity
@Table(name = "SCORET", catalog = "", schema = "TAANI")
@NamedQueries({
    @NamedQuery(name = "Scoret.findAll", query = "SELECT s FROM Scoret s")
    , @NamedQuery(name = "Scoret.findById", query = "SELECT s FROM Scoret s WHERE s.id = :id")
    , @NamedQuery(name = "Scoret.findByName", query = "SELECT s FROM Scoret s WHERE s.name = :name")
    , @NamedQuery(name = "Scoret.findByScore", query = "SELECT s FROM Scoret s WHERE s.score = :score")
    , @NamedQuery(name = "Scoret.findByDate", query = "SELECT s FROM Scoret s WHERE s.date = :date")})
public class Scoret implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SCORE")
    private Integer score;
    @Column(name = "DATE")
    private String date;

    public Scoret() {
    }

    public Scoret(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        Long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        Integer oldScore = this.score;
        this.score = score;
        changeSupport.firePropertyChange("score", oldScore, score);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Scoret)) {
            return false;
        }
        Scoret other = (Scoret) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "learningtool.Scoret[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
