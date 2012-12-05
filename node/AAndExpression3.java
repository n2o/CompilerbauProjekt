/* This file was generated by SableCC (http://www.sablecc.org/). */

package node;

import analysis.*;

@SuppressWarnings("nls")
public final class AAndExpression3 extends PExpression3
{
    private PExpression3 _expression3_;
    private TAnd _and_;
    private PExpression4 _expression4_;

    public AAndExpression3()
    {
        // Constructor
    }

    public AAndExpression3(
        @SuppressWarnings("hiding") PExpression3 _expression3_,
        @SuppressWarnings("hiding") TAnd _and_,
        @SuppressWarnings("hiding") PExpression4 _expression4_)
    {
        // Constructor
        setExpression3(_expression3_);

        setAnd(_and_);

        setExpression4(_expression4_);

    }

    @Override
    public Object clone()
    {
        return new AAndExpression3(
            cloneNode(this._expression3_),
            cloneNode(this._and_),
            cloneNode(this._expression4_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAndExpression3(this);
    }

    public PExpression3 getExpression3()
    {
        return this._expression3_;
    }

    public void setExpression3(PExpression3 node)
    {
        if(this._expression3_ != null)
        {
            this._expression3_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression3_ = node;
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

    public PExpression4 getExpression4()
    {
        return this._expression4_;
    }

    public void setExpression4(PExpression4 node)
    {
        if(this._expression4_ != null)
        {
            this._expression4_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression4_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expression3_)
            + toString(this._and_)
            + toString(this._expression4_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expression3_ == child)
        {
            this._expression3_ = null;
            return;
        }

        if(this._and_ == child)
        {
            this._and_ = null;
            return;
        }

        if(this._expression4_ == child)
        {
            this._expression4_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expression3_ == oldChild)
        {
            setExpression3((PExpression3) newChild);
            return;
        }

        if(this._and_ == oldChild)
        {
            setAnd((TAnd) newChild);
            return;
        }

        if(this._expression4_ == oldChild)
        {
            setExpression4((PExpression4) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
