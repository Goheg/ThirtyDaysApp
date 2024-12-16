package com.example.thirtydaysapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydaysapp.R

data class DayTips(
     val streak: Int,
    @StringRes val tasks: Int,
    @DrawableRes val imageTask: Int,
    @StringRes val descriptionRes: Int
)

val dayTips = listOf(
    DayTips(
        streak = 1,
        tasks = R.string.task_breathing,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_breathing
    ),
    DayTips(
        streak = 2,
        tasks = R.string.task_morning_walk,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_morning_walk
    ),
    DayTips(
        streak = 3,
        tasks = R.string.task_gratitude_journal,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_journal
    ),
    DayTips(
        streak = 4,
        tasks = R.string.task_healthy_snack,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_snack
    ),
    DayTips(
        streak = 5,
        tasks = R.string.task_meditation,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_meditation
    ),
    DayTips(
        streak = 6,
        tasks = R.string.task_stretching,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_stretching
    ),
    DayTips(
        streak = 7,
        tasks = R.string.task_social_connection,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_social_connection
    ),
    DayTips(
        streak = 8,
        tasks = R.string.task_drink_water,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_drink_water
    ),
    DayTips(
        streak = 9,
        tasks = R.string.task_nature_walk,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_nature_walk
    ),
    DayTips(
        streak = 10,
        tasks = R.string.task_read_book,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_read_book
    ),
    DayTips(
        streak = 11,
        tasks = R.string.task_positive_affirmations,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_positive_affirmations
    ),
    DayTips(
        streak = 12,
        tasks = R.string.task_exercise,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_exercise
    ),
    DayTips(
        streak = 13,
        tasks = R.string.task_music_relaxation,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_music_relaxation
    ),
    DayTips(
        streak = 14,
        tasks = R.string.task_plan_goals,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_plan_goals
    ),
    DayTips(
        streak = 15,
        tasks = R.string.task_self_reflection,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_self_reflection
    ),
    DayTips(
        streak = 16,
        tasks = R.string.task_healthy_meal,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_healthy_meal
    ),
    DayTips(
        streak = 17,
        tasks = R.string.task_call_friend,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_call_friend
    ),
    DayTips(
        streak = 18,
        tasks = R.string.task_random_act_kindness,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_random_act_kindness
    ),
    DayTips(
        streak = 19,
        tasks = R.string.task_mindful_eating,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_mindful_eating
    ),
    DayTips(
        streak = 20,
        tasks = R.string.task_journal_reflection,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_journal_reflection
    ),
    DayTips(
        streak = 21,
        tasks = R.string.task_spend_time_outdoors,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_spend_time_outdoors
    ),
    DayTips(
        streak = 22,
        tasks = R.string.task_unplug_tech,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_unplug_tech
    ),
    DayTips(
        streak = 23,
        tasks = R.string.task_try_new_hobby,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_try_new_hobby
    ),
    DayTips(
        streak = 24,
        tasks = R.string.task_declutter_space,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_declutter_space
    ),
    DayTips(
        streak = 25,
        tasks = R.string.task_laugh_more,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_laugh_more
    ),
    DayTips(
        streak = 26,
        tasks = R.string.task_sleep_well,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_sleep_well
    ),
    DayTips(
        streak = 27,
        tasks = R.string.task_listen_podcast,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_listen_podcast
    ),
    DayTips(
        streak = 28,
        tasks = R.string.task_relax_bath,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_relax_bath
    ),
    DayTips(
        streak = 29,
        tasks = R.string.task_practice_gratitude,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_practice_gratitude
    ),
    DayTips(
        streak = 30,
        tasks = R.string.task_review_progress,
        imageTask = R.drawable.thirtydayimage,
        descriptionRes = R.string.desc_review_progress
    )
)
