package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.union.MetadataContentUnion
import net.kigawa.renlin.w3c.category.union.FlowMetadataPhrasingUnion
import net.kigawa.renlin.w3c.category.union.FlowMetadataPhrasingScriptSupportingUnion

/**
 * Union to MetadataContentUnion, FlowMetadataPhrasingUnion, FlowMetadataPhrasingScriptSupportingUnion
 */
interface MetadataContentContent :  MetadataContentUnion, FlowMetadataPhrasingUnion, FlowMetadataPhrasingScriptSupportingUnion, ContentCategory