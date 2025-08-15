package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.ACategory
import net.kigawa.renlin.w3c.category.native.AudioCategory
import net.kigawa.renlin.w3c.category.native.ImgCategory
import net.kigawa.renlin.w3c.category.native.VideoCategory
import net.kigawa.renlin.w3c.category.native.EmbedCategory
import net.kigawa.renlin.w3c.category.native.IframeCategory
import net.kigawa.renlin.w3c.category.native.ObjectCategory
import net.kigawa.renlin.w3c.category.native.ButtonCategory
import net.kigawa.renlin.w3c.category.native.InputCategory
import net.kigawa.renlin.w3c.category.native.LabelCategory
import net.kigawa.renlin.w3c.category.native.SelectCategory
import net.kigawa.renlin.w3c.category.native.TextareaCategory
import net.kigawa.renlin.w3c.category.native.DetailsCategory

/**
 * InteractiveContent represents elements that are part of the interactive content category.
 * Parent: PhrasingContent
 */
interface InteractiveContent : ContentCategory, PhrasingContent, ACategory, AudioCategory, ImgCategory, VideoCategory, EmbedCategory, IframeCategory, ObjectCategory, ButtonCategory, InputCategory, LabelCategory, SelectCategory, TextareaCategory, DetailsCategory