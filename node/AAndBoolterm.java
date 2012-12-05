/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAndBoolterm extends PBoolterm
{
    private PBoolterm _boolterm_;
    private TAnd _and_;
    private PBoolfactor _boolfactor_;

    public AAndBoolterm()
    {
        // Constructor
    }

    public AAndBoolterm(
        @SuppressWarnings("hiding") PBoolterm _boolterm_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PBoolfactor _boolfactor_)
    {
        // Constructor
        setBoolterm(_boolterm_);

        setAnd(_and_);

        setBoolfactor(_boolfactor_);

    }

    @Override
    public Object clone()
    {
        return new AAndBoolterm(
            cloneNode(this._boolterm_),
            cloneNode(this._and_),
            cloneNode(this._boolfactor_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndBoolterm(this);
    }

    public PBoolterm getBoolterm()
    {
        return this._boolterm_;
    }

    public void setBoolterm(PBoolterm node)
    {
        if(this._boolterm_ != null)
        {
            this._boolterm_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolterm_ = node;
    }

    public TAnd getAnd()
    {
        return this._and_;
    }

    public void setAnd(TAnd node)
    {
        if(this._and_ != null)
        {
            this._and_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._and_ = node;
    }

    public PBoolfactor getBoolfactor()
    {
        return this._boolfactor_;
    }

    public void setBoolfactor(PBoolfactor node)
    {
        if(this._boolfactor_ != null)
        {
            this._boolfactor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._boolfactor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._boolterm_)
            + toString(this._and_)
            + toString(this._boolfactor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._boolterm_ == child)
        {
            this._boolterm_ = null;
            return;
        }

        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._boolfactor_ == child)
        {
            this._boolfactor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._boolterm_ == oldChild)
        {
            setBoolterm((PBoolterm) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._boolfactor_ == oldChild)
        {
            setBoolfactor((PBoolfactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}