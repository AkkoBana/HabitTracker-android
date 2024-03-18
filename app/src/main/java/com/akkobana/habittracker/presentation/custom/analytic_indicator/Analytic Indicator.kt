package com.akkobana.habittracker.presentation.custom.analytic_indicator

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import com.akkobana.habittracker.R
import kotlin.properties.Delegates

class AnalyticIndicator @JvmOverloads constructor (
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
):  View(context, attributeSet, defStyleAttr, defStyleRes) {

    private var progress: Int by Delegates.notNull()
    private var fillColor: Int by Delegates.notNull()
    private var outfillColor: Int by Delegates.notNull()

    private var analyticRect = RectF()

    private lateinit var analyticFilledPaint: Paint
    private lateinit var analyticOutFilledPaint: Paint
    private lateinit var analyticTextAppearance: Paint

    init {
        if (attributeSet != null) {
            initAttributes(attributeSet, defStyleAttr, defStyleRes)
        } else {
            initDefaultConstructor()
        }
        initPaints()
        if (isInEditMode) {

        }
        isClickable = true
        isFocusable = true
    }


    private fun initAttributes(attributeSet: AttributeSet, defStyleAttr: Int, defStyleRes: Int) {
        val typedArray = context.obtainStyledAttributes(
            attributeSet,
            R.styleable.AnalyticIndicator,
            defStyleAttr,
            defStyleRes
        )

        progress = typedArray.getInt(R.styleable.AnalyticIndicator_progress, DEFAULT_PROGRESS)
        fillColor = typedArray.getColor(R.styleable.AnalyticIndicator_fillColor, DEFAULT_FILL_COLOR)
        outfillColor = typedArray.getColor(R.styleable.AnalyticIndicator_outfillColor, DEFAULT_OUTFILL_COLOR)

        typedArray.recycle()
    }

    private fun initDefaultConstructor() {
        progress = DEFAULT_PROGRESS
        fillColor = DEFAULT_FILL_COLOR
        outfillColor = DEFAULT_OUTFILL_COLOR
    }

    private fun initPaints() {
        analyticFilledPaint = Paint().apply {

        }
        analyticOutFilledPaint = Paint().apply {

        }
        analyticTextAppearance = Paint().apply {

        }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val minHeight = suggestedMinimumHeight
        val minWidth = suggestedMinimumWidth

        val desiredSwitchHeightSizeInPixels = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            DESIRED_SWITCH_HEIGHT,
            resources.displayMetrics
        ).toInt()
        val desiredSwitchWidthSizeInPixels = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP,
            DESIRED_SWITCH_WIDTH,
            resources.displayMetrics
        ).toInt()

        val desiredHeight =
            Integer.max(minHeight, desiredSwitchHeightSizeInPixels)
        val desiredWidth =
            Integer.max(minWidth, desiredSwitchWidthSizeInPixels)

        setMeasuredDimension(
            resolveSize(desiredWidth, widthMeasureSpec),
            resolveSize(desiredHeight, heightMeasureSpec)
        )
    }

    override fun onDraw(canvas: Canvas) {
        drawAnalyticGraph(canvas)
        drawProgressFilled(canvas)
        drawText(canvas)
    }

    private fun drawAnalyticGraph(canvas: Canvas) {
        canvas.drawArc(analyticRect, )
    }

    private fun drawProgressFilled(canvas: Canvas) {

    }

    private fun drawText(canvas: Canvas) {

    }

    companion object {
        const val DEFAULT_PROGRESS = 0
        const val DEFAULT_FILL_COLOR = Color.GRAY
        const val DEFAULT_OUTFILL_COLOR = Color.GREEN
    }
}