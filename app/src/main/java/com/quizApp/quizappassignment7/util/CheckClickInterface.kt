package com.quizApp.quizappassignment7.util

import com.quizApp.quizappassignment7.data.AnswerModel

interface CheckClickInterface {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}