package com.lambdaschool;

public class Dollar extends AbstractCurrency
{
    public Dollar(int modifier)
    {
        super("$", 1.0, modifier);
    }

    public Dollar()
    {
        super("$", 1.0, 1);
    }

    @Override
    public String toString()
    {
        return this.getName() + (int)this.getTotalValue();
    }
}
