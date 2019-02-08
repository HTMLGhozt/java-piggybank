package com.lambdaschool;

public class Nickle extends AbstractCurrency
{
    public Nickle(int modifier)
    {
        super("Nickle", 0.05, modifier);
    }
    public Nickle()
    {
        super("Nickle", 0.05, 1);
    }
}
