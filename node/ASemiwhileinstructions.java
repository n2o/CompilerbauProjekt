/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ASemiwhileinstructions extends PSemiwhileinstructions
{
    private TSemikolon _semikolon_;
    private PWhileinstructions _whileinstructions_;

    public ASemiwhileinstructions()
    {
        // Constructor
    }

    public ASemiwhileinstructions(
        @SuppressWarnings("hiding") TSemikolon _semikolon_,
        @SuppressWarnings("hiding") PWhileinstructions _whileinstructions_)
    {
        // Constructor
        setSemikolon(_semikolon_);

        setWhileinstructions(_whileinstructions_);

    }

    @Override
    public Object clone()
    {
        return new ASemiwhileinstructions(
            cloneNode(this._semikolon_),
            cloneNode(this._whileinstructions_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASemiwhileinstructions(this);
    }

    public TSemikolon getSemikolon()
    {
        return this._semikolon_;
    }

    public void setSemikolon(TSemikolon node)
    {
        if(this._semikolon_ != null)
        {
            this._semikolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semikolon_ = node;
    }

    public PWhileinstructions getWhileinstructions()
    {
        return this._whileinstructions_;
    }

    public void setWhileinstructions(PWhileinstructions node)
    {
        if(this._whileinstructions_ != null)
        {
            this._whileinstructions_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._whileinstructions_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._semikolon_)
            + toString(this._whileinstructions_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._semikolon_ == child)
        {
            this._semikolon_ = null;
            return;
        }

        if(this._whileinstructions_ == child)
        {
            this._whileinstructions_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._semikolon_ == oldChild)
        {
            setSemikolon((TSemikolon) newChild);
            return;
        }

        if(this._whileinstructions_ == oldChild)
        {
            setWhileinstructions((PWhileinstructions) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}