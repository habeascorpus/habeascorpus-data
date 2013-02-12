package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
cache	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataInput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
DataOutput	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
ColumnFamily	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
db	TokenNameIdentifier
.	TokenNameDOT
TypeSizes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ISerializer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
MessagingService	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SerializingCacheProvider	TokenNameIdentifier
implements	TokenNameimplements
IRowCacheProvider	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
ICache	TokenNameIdentifier
<	TokenNameLESS
RowCacheKey	TokenNameIdentifier
,	TokenNameCOMMA
IRowCacheEntry	TokenNameIdentifier
>	TokenNameGREATER
create	TokenNameIdentifier
(	TokenNameLPAREN
long	TokenNamelong
capacity	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
SerializingCache	TokenNameIdentifier
.	TokenNameDOT
create	TokenNameIdentifier
(	TokenNameLPAREN
capacity	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
RowCacheSerializer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
class	TokenNameclass
RowCacheSerializer	TokenNameIdentifier
implements	TokenNameimplements
ISerializer	TokenNameIdentifier
<	TokenNameLESS
IRowCacheEntry	TokenNameIdentifier
>	TokenNameGREATER
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
serialize	TokenNameIdentifier
(	TokenNameLPAREN
IRowCacheEntry	TokenNameIdentifier
entry	TokenNameIdentifier
,	TokenNameCOMMA
DataOutput	TokenNameIdentifier
out	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
assert	TokenNameassert
entry	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
boolean	TokenNameboolean
isSentinel	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
instanceof	TokenNameinstanceof
RowCacheSentinel	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
writeBoolean	TokenNameIdentifier
(	TokenNameLPAREN
isSentinel	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isSentinel	TokenNameIdentifier
)	TokenNameRPAREN
out	TokenNameIdentifier
.	TokenNameDOT
writeLong	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
RowCacheSentinel	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
sentinelId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serialize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
,	TokenNameCOMMA
out	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
IRowCacheEntry	TokenNameIdentifier
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
DataInput	TokenNameIdentifier
in	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
boolean	TokenNameboolean
isSentinel	TokenNameIdentifier
=	TokenNameEQUAL
in	TokenNameIdentifier
.	TokenNameDOT
readBoolean	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
isSentinel	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
RowCacheSentinel	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
.	TokenNameDOT
readLong	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
deserialize	TokenNameIdentifier
(	TokenNameLPAREN
in	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
long	TokenNamelong
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
IRowCacheEntry	TokenNameIdentifier
entry	TokenNameIdentifier
,	TokenNameCOMMA
TypeSizes	TokenNameIdentifier
typeSizes	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
size	TokenNameIdentifier
=	TokenNameEQUAL
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
entry	TokenNameIdentifier
instanceof	TokenNameinstanceof
RowCacheSentinel	TokenNameIdentifier
)	TokenNameRPAREN
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
typeSizes	TokenNameIdentifier
.	TokenNameDOT
sizeof	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
RowCacheSentinel	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
sentinelId	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
size	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
ColumnFamily	TokenNameIdentifier
.	TokenNameDOT
serializer	TokenNameIdentifier
.	TokenNameDOT
serializedSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
ColumnFamily	TokenNameIdentifier
)	TokenNameRPAREN
entry	TokenNameIdentifier
,	TokenNameCOMMA
typeSizes	TokenNameIdentifier
,	TokenNameCOMMA
MessagingService	TokenNameIdentifier
.	TokenNameDOT
current_version	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
size	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE