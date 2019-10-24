package com.dateanddate

import java.text.SimpleDateFormat

Date date = new Date()

SimpleDateFormat sfd = new SimpleDateFormat("dd-MM-yyyy HH:mm ss aa z")

String s1 = sfd.format(date)

println s1