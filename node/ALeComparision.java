/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ALeComparision extends PComparision
{
    private TLe _le_;

    public ALeComparision()
    {
        // Constructor
    }

    public ALeComparision(
        @SuppressWarnings("hiding") TLe _le_)
    {
        // Constructor
        setLe(_le_);

    }

    @Override
    public Object clone()
    {
        return new ALeComparision(
            cloneNode(this._le_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALeComparision(this);
    }

    public TLe getLe()
    {
        return this._le_;
    }

    public void setLe(TLe node)
    {
        if(this._le_ != null)
        {
            this._le_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._le_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._le_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._le_ == child)
        {
            this._le_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._le_ == oldChild)
        {
            setLe((TLe) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
