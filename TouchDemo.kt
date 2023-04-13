package com.example.touchdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.view.MotionEvent
import android.view.View
import android.widget.Toast

class TouchDemo (context: Context):View(context) {
    private var p=Paint()
    private var l=0
    private var r=400
    private var l1=1000
    private var r1=1400
    private var x=100
    private var x1=1200

    override fun onDraw(canvas: Canvas?) {
        p.color= Color.GRAY
        canvas?.drawRect(l.toFloat(),200f,r.toFloat(),600f,p)
        p.color= Color.MAGENTA
        canvas?.drawRect(l1.toFloat(),700f,r1.toFloat(),1100f,p)
        p.textSize = 50f
        p.color=Color.BLACK
        canvas?.drawText("Keshav", x.toFloat(), 400f, p);
        canvas?.drawText("44", x1.toFloat(), 900f, p);

    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when(event?.action)
        {
            MotionEvent.ACTION_DOWN->startFan()
            MotionEvent.ACTION_UP->stopFan()
        }
        return true
    }

    private fun stopFan() {

        Toast.makeText(context, width.toString(), Toast.LENGTH_SHORT).show()
        if(l>=width)
        {
            x=100
            x1=1200
            l=0
            r=400
            l1=1000
            r1=1400
        }
        invalidate()
    }

    private fun startFan() {
        if(l>=width)
        {
            l=0
            r=400
            l1=1000
            r1=1400
            x=100
            x1=1200
        }
        l += 100
        x+=100
        x1-=100
        l1-=100
        r1-=100
        r += 100
        invalidate()
    }
}

