package com.example.resumeparser.model;

import java.util.Objects;

public class Skill {
    private String name;
    private String proficiencyLevel;

    public Skill(String name, String proficiencyLevel) {
        this.name = name;
        this.proficiencyLevel = proficiencyLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProficiencyLevel() {
        return proficiencyLevel;
    }

    public void setProficiencyLevel(String proficiencyLevel) {
        this.proficiencyLevel = proficiencyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Skill)) return false;
        Skill skill = (Skill) o;
        return Objects.equals(name, skill.name) &&
               Objects.equals(proficiencyLevel, skill.proficiencyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, proficiencyLevel);
    }

    @Override
    public String toString() {
        return "Skill{" +
               "name='" + name + '\'' +
               ", proficiencyLevel='" + proficiencyLevel + '\'' +
               '}';
    }
}