package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.AudioCategory
import net.kigawa.renlin.w3c.category.native.ImgCategory
import net.kigawa.renlin.w3c.category.native.VideoCategory
import net.kigawa.renlin.w3c.category.native.EmbedCategory
import net.kigawa.renlin.w3c.category.native.IframeCategory
import net.kigawa.renlin.w3c.category.native.ObjectCategory
import net.kigawa.renlin.w3c.category.native.PictureCategory
import net.kigawa.renlin.w3c.category.native.SvgCategory
import net.kigawa.renlin.w3c.category.native.MathCategory
import net.kigawa.renlin.w3c.category.native.CanvasCategory

/**
 * EmbeddedContent represents elements that are part of the embedded content category.
 * Parent: PhrasingContent
 */
interface EmbeddedContent : ContentCategory, PhrasingContent, AudioCategory, ImgCategory, VideoCategory, EmbedCategory, IframeCategory, ObjectCategory, PictureCategory, SvgCategory, MathCategory, CanvasCategory