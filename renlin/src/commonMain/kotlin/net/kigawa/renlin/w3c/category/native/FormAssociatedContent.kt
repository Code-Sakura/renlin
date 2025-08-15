package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.ImgCategory
import net.kigawa.renlin.w3c.category.native.ObjectCategory
import net.kigawa.renlin.w3c.category.native.ButtonCategory
import net.kigawa.renlin.w3c.category.native.FieldsetCategory
import net.kigawa.renlin.w3c.category.native.InputCategory
import net.kigawa.renlin.w3c.category.native.OutputCategory
import net.kigawa.renlin.w3c.category.native.SelectCategory
import net.kigawa.renlin.w3c.category.native.TextareaCategory

/**
 * FormAssociatedContent represents elements that are part of the formassociated content category.
 * 
 */
interface FormAssociatedContent : ContentCategory, ImgCategory, ObjectCategory, ButtonCategory, FieldsetCategory, InputCategory, OutputCategory, SelectCategory, TextareaCategory