/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class ABoolcompExpr extends PExpr
{
    private PBoolcomp _boolcomp_;

    public ABoolcompExpr()
    {
        // Constructor
    }

    public ABoolcompExpr(
        @SuppressWarnings("hiding") PBoolcomp _boolcomp_)
    {
        // Constructor
        setBoolcomp(_boolcomp_);

    }

    @Override
    public Object clone()
    {
        return new ABoolcompExpr(
            cloneNode(this._boolcomp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABoolcompExpr(this);
    }

    public PBoolcomp getBoolcomp()
    {
        return this._boolcomp_;
    }

    public void setBoolcomp(PBoolcomp node)
    {
        if(this._boolcomp_ != null)
        {
            this._boolcomp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolcomp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolcomp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolcomp_ == child)
        {
            this._boolcomp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolcomp_ == oldChild)
        {
            setBoolcomp((PBoolcomp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}