package com.lambdaschool;

public class Quarter extends AbstractCurrency
{
    public Quarter(int modifier)
    {
        super("Quarter", 0.25, modifier);
    }

    public Quarter()
    {
        super("Quarter", 0.25, 1);
    }
}
