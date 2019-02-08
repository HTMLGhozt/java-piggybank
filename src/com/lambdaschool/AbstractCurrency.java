package com.lambdaschool;

public abstract class AbstractCurrency
{
    private String name;
    private double value;
    private int modifier;

    public AbstractCurrency(String name, double value, int modifier)
    {
        this.name = name;
        this.value = value;
        this.modifier = modifier;
    }

    public String getName()
    {
        return name;
    }

    public int getModifier()
    {
        return modifier;
    }

    public double getTotalValue()
    {
        return value * modifier;
    }

    @Override
    public String toString()
    {
        return this.getModifier() + " " + this.getName();
    }
}
