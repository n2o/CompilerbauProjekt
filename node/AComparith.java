/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AComparith extends PComparith
{
    private PComparision _comparision_;
    private PArithexpr _arithexpr_;

    public AComparith()
    {
        // Constructor
    }

    public AComparith(
        @SuppressWarnings("hiding") PComparision _comparision_,
        @SuppressWarnings("hiding") PArithexpr _arithexpr_)
    {
        // Constructor
        setComparision(_comparision_);

        setArithexpr(_arithexpr_);

    }

    @Override
    public Object clone()
    {
        return new AComparith(
            cloneNode(this._comparision_),
            cloneNode(this._arithexpr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAComparith(this);
    }

    public PComparision getComparision()
    {
        return this._comparision_;
    }

    public void setComparision(PComparision node)
    {
        if(this._comparision_ != null)
        {
            this._comparision_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparision_ = node;
    }

    public PArithexpr getArithexpr()
    {
        return this._arithexpr_;
    }

    public void setArithexpr(PArithexpr node)
    {
        if(this._arithexpr_ != null)
        {
            this._arithexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arithexpr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comparision_)
            + toString(this._arithexpr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comparision_ == child)
        {
            this._comparision_ = null;
            return;
        }

        if(this._arithexpr_ == child)
        {
            this._arithexpr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comparision_ == oldChild)
        {
            setComparision((PComparision) newChild);
            return;
        }

        if(this._arithexpr_ == oldChild)
        {
            setArithexpr((PArithexpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}