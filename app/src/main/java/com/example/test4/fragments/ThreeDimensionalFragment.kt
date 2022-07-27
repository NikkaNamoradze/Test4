package com.example.test4.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageButton
import com.example.test4.R
import com.example.test4.databinding.FragmentThreeDimensionalBinding


class ThreeDimensionalFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentThreeDimensionalBinding? = null
    private val binding get() = _binding!!

    private var firstPlayerArray = mutableListOf<Int>()
    private var secondPlayerArray = mutableListOf<Int>()

    private var currentPlayer = 0
    private var roundPlayed = 0
    private var buttonNumber = 0
    private var winnerPlayer = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreeDimensionalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        listeners()
    }


    private fun listeners() {

        binding.btn1.setOnClickListener(this)
        binding.btn2.setOnClickListener(this)
        binding.btn3.setOnClickListener(this)
        binding.btn4.setOnClickListener(this)
        binding.btn5.setOnClickListener(this)
        binding.btn6.setOnClickListener(this)
        binding.btn7.setOnClickListener(this)
        binding.btn8.setOnClickListener(this)
        binding.btn9.setOnClickListener(this)
        binding.btnReset.setOnClickListener {
            resetGame()
        }

    }


    override fun onClick(clickedView: View?) {

        if (clickedView is View) {


            when (clickedView.id) {
                R.id.btn1 -> buttonNumber = 1
                R.id.btn2 -> buttonNumber = 2
                R.id.btn3 -> buttonNumber = 3
                R.id.btn4 -> buttonNumber = 4
                R.id.btn5 -> buttonNumber = 5
                R.id.btn6 -> buttonNumber = 6
                R.id.btn7 -> buttonNumber = 7
                R.id.btn8 -> buttonNumber = 8
                R.id.btn9 -> buttonNumber = 9
                R.id.btnReset -> resetGame()
            }
        }

        if (buttonNumber != 0) {
            playGame(clickedView as AppCompatImageButton, buttonNumber)
        }

    }

    private fun playGame(clickedView: AppCompatImageButton, buttonNumber: Int) {


        if (currentPlayer == 0) {
            clickedView.setBackgroundResource(R.drawable.x)
            currentPlayer = 1
            firstPlayerArray.add(buttonNumber)
            roundPlayed += 1

        } else {
            clickedView.setBackgroundResource(R.drawable.o)
            currentPlayer = 0
            secondPlayerArray.add(buttonNumber)
            roundPlayed += 1

        }
        clickedView.isEnabled = false
        checkWinner()

    }

    @SuppressLint("SetTextI18n")
    private fun checkWinner() {


        when {
            firstPlayerArray.contains(1) && firstPlayerArray.contains(2) && firstPlayerArray.contains(
                3
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(2) && secondPlayerArray.contains(
                3
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(4) && firstPlayerArray.contains(5) && firstPlayerArray.contains(
                6
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(4) && secondPlayerArray.contains(5) && secondPlayerArray.contains(
                6
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(7) && firstPlayerArray.contains(8) && firstPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(7) && secondPlayerArray.contains(8) && secondPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(1) && firstPlayerArray.contains(4) && firstPlayerArray.contains(
                7
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(4) && secondPlayerArray.contains(
                7
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(2) && firstPlayerArray.contains(5) && firstPlayerArray.contains(
                8
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(2) && secondPlayerArray.contains(5) && secondPlayerArray.contains(
                8
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(3) && firstPlayerArray.contains(6) && firstPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(3) && secondPlayerArray.contains(6) && secondPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(1) && firstPlayerArray.contains(5) && firstPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(1) && secondPlayerArray.contains(5) && secondPlayerArray.contains(
                9
            ) ->
                winnerPlayer = 2
            firstPlayerArray.contains(3) && firstPlayerArray.contains(5) && firstPlayerArray.contains(
                7
            ) ->
                winnerPlayer = 1
            secondPlayerArray.contains(3) && secondPlayerArray.contains(5) && secondPlayerArray.contains(
                7
            ) ->
                winnerPlayer = 2

        }

        when {
            winnerPlayer == 1 -> {
                binding.tvWinner.text = "${binding.tvWinner.text} X is winner "
                disableButtons()
            }
            winnerPlayer == 2 -> {
                binding.tvWinner.text = "${binding.tvWinner.text} O is winner "
                disableButtons()
            }
            roundPlayed == 9 -> {
                binding.tvWinner.text = "Game is Tie"
            }
        }

    }


    private fun disableButtons() {
        binding.btn1.isEnabled = false
        binding.btn2.isEnabled = false
        binding.btn3.isEnabled = false
        binding.btn4.isEnabled = false
        binding.btn5.isEnabled = false
        binding.btn6.isEnabled = false
        binding.btn7.isEnabled = false
        binding.btn8.isEnabled = false
        binding.btn9.isEnabled = false
    }

    private fun enableButtons() {
        binding.btn1.isEnabled = true
        binding.btn2.isEnabled = true
        binding.btn3.isEnabled = true
        binding.btn4.isEnabled = true
        binding.btn5.isEnabled = true
        binding.btn6.isEnabled = true
        binding.btn7.isEnabled = true
        binding.btn8.isEnabled = true
        binding.btn9.isEnabled = true
    }

    private fun resetGame() {
        binding.btn1.setBackgroundResource(R.color.black)
        binding.btn2.setBackgroundResource(R.color.black)
        binding.btn3.setBackgroundResource(R.color.black)
        binding.btn4.setBackgroundResource(R.color.black)
        binding.btn5.setBackgroundResource(R.color.black)
        binding.btn6.setBackgroundResource(R.color.black)
        binding.btn7.setBackgroundResource(R.color.black)
        binding.btn8.setBackgroundResource(R.color.black)
        binding.btn9.setBackgroundResource(R.color.black)

        firstPlayerArray.clear()
        secondPlayerArray.clear()
        winnerPlayer = 0
        roundPlayed = 0

        currentPlayer = 0

        enableButtons()
    }

}